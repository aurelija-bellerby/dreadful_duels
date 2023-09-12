import Deck from "./Deck";
import Arena from "./Arena";
import Results from "./Results";
import Player from "./Player";
import React,{useState, useEffect} from "react";
import SelectLegend from "./SelectLegend";



function GameManager(){

    const [cards, setCards] = useState([])
    const [playerSelection, setPlayerSelection] = useState(null)
    const [computerSelection, setComputerSelection] = useState(null)
    const [deck, setDeck] = useState(null)
    const [playerScore, setPlayerScore] = useState(0)
    const [computerScore, setComputerScore] = useState(0)
    const [counter, setCounter] = useState(0)
    const [playerName, setPlayerName] = useState(null)
    const [legendName, setLegendName] = useState(null)
    const [legends, setLegends] = useState([
              "Porko The Tamer",
              "Kagke The War Troll",
              "Aurelijon From The Cosmic Dawn",
              "Roberto Of The 7 Seas",
              "Rainer The Paladin",
              "Yismin From The Shadow Isles"]) ;
    

    useEffect(()=>{
      getCards();
    },[])

    useEffect(()=>{
      resetBoard();
    }, [playerScore])

    useEffect(()=>{
      resetBoard();
    }, [computerScore])
  
    const getCards = async function(){
      const res = await fetch("/cards") 
      const data = await res.json()
      setCards(data)
    }

    const handlePlayCard = () =>{
        const computerCard = deck.pop();
        setComputerSelection(computerCard);
        const playerCard = deck.pop();
        setPlayerSelection(playerCard);
    }
    
    const addCardsToDeck = () =>{
      const allCards = [...cards]
      const shuffledDeck = allCards
        .map(value => ({ value, sort: Math.random() }))
        .sort((a, b) => a.sort - b.sort)
        .map(({ value }) => value)
        .slice(0, 20)
      setDeck(shuffledDeck)
    }

    const updateCounter = () => {
      const currentCounter = counter
      setCounter(currentCounter + 1)
    }

    const handleWinner = (winner) =>{
      const computerPoints = computerScore
      const playerPoints = playerScore

      if(winner === playerSelection){
        setPlayerScore(playerPoints + 1)
      }
      else if(winner === computerSelection){
        setComputerScore(computerPoints + 1)
      }
      else {
        setPlayerScore(playerScore + 1)
        setComputerScore(computerPoints + 1)
      }
      updateCounter()
    }
    const resetBoard = ()=>{
        setPlayerSelection(null)
        setComputerSelection(null)
    }

    const updateNames =(legend, player) => {
      
      setLegendName(legend)
      setPlayerName(player)

    }
    // const handleChange = (event)=>{
    //   setLegendName(event.target.value);
    // }

    return(
   
      <div>
        <SelectLegend legends={legends} onSubmit={updateNames}/>
        <Player score={playerScore} name={playerName}/>
        { counter < 10 ? <Arena playerSelection={playerSelection} computerSelection={computerSelection} handleWinner={handleWinner} resetBoard={resetBoard} roundCounter={counter} deck={deck}/> : <Results playerScore={playerScore} computerScore={computerScore} /> }
        { counter < 10 ? <Deck deck={deck} handlePlayCard={handlePlayCard}/> : null }
        { deck ? null : <button onClick={addCardsToDeck} >Start New Game</button>}
        <Player score={computerScore} name={legendName}/>
      </div>
    
    )

}

export default GameManager;