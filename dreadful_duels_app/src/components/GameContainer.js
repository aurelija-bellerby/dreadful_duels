import React from 'react'
import Player from './Player';
import Arena from './Arena';
import Results from './Results';
import Deck from './Deck';

function GameContainer({playerScore, playerName, counter, playerSelection,computerSelection,handleWinner,resetBoard,deck,computerScore,handlePlayCard,legendName}) {
  return (
      <div className="grid grid-cols-3">
          <div className="col-span-3 text-xl">
            <Player score={playerScore} name={playerName} />
          </div>
          <div className="col-span-2">
          { counter < 10 ? <Arena playerSelection={playerSelection} computerSelection={computerSelection} handleWinner={handleWinner} resetBoard={resetBoard} roundCounter={counter} deck={deck}/> : <Results playerScore={playerScore} computerScore={computerScore} /> }
          </div>
          <div>
            { counter < 10 ? <Deck deck={deck} handlePlayCard={handlePlayCard}/> : null }
          </div>
          <div className="col-span-3 text-xl">
            <Player score={computerScore} name={legendName}/>
          </div>
      </div>
    
  )
}

export default GameContainer;
