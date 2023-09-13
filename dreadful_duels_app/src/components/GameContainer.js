import React from 'react'
import Player from './Player';
import Arena from './Arena';
import Results from './Results';
import Deck from './Deck';

function GameContainer({playerScore, playerName, counter, playerSelection,computerSelection,handleWinner,resetBoard,deck,computerScore,handlePlayCard,legendName, roundCounter}) {
  return (
    <div className="grid grid-cols-3 min-h-screen font-serif text-neutral-200 pl-32 py-16" style={{
      backgroundImage: `url("https://i.postimg.cc/bvYP3kcb/dark-cement-textured-background.jpg")`,
      backgroundPosition: `center`,
      backgroundSize: `cover`,
      backgroundRepeat: `no-repeat`
      }}>
          <div className="text-xl justify-self-center">
            <Player score={computerScore} name={legendName}/>
          </div>
          <div className="justify-self-center">
            {deck ?<div className="text-3xl drop-shadow-[0_3px_3px_rgba(0,0,0,5)] pt-10">Round: {counter + 1}</div>: null}
          </div>
          <div></div>
          <div className="col-span-2">
          { counter < 10 ?
            <Arena
              playerSelection={playerSelection}
              computerSelection={computerSelection}
              handleWinner={handleWinner}
              resetBoard={resetBoard}/>
              : <Results playerScore={playerScore} computerScore={computerScore} /> }
          </div>
          <div className='justify-self-center'>
            { counter < 10 ? <Deck deck={deck} handlePlayCard={handlePlayCard}/> : null }
          </div>
          <div className="text-xl justify-self-center">
            <Player score={playerScore} name={playerName} />
          </div>
      </div>
    
  )
}

export default GameContainer;
