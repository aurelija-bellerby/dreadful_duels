import Card from "./Card";

function Arena({playerSelection, computerSelection, handleWinner, roundCounter, deck}){

    const handleDuel = ()=>{

        if(playerSelection != null && computerSelection != null) {
            const playerHealth = playerSelection.defence - computerSelection.attack
            const computerHealth = computerSelection.defence - playerSelection.attack

            if (playerHealth > computerHealth) {
                handleWinner(playerSelection)
            } else if (computerHealth > playerHealth) {
                handleWinner(computerSelection)
            } else {
                handleWinner(null)
            }
        }
    }

        return(
            <div className="grid grid-cols-2">
                <div>
                    {deck ?<div>Round: {roundCounter + 1}</div>: null}
                </div>
                <div>
                    {computerSelection ? <Card card={computerSelection}></Card> : null}
                </div>
                <div>
                    {playerSelection ?<button onClick={handleDuel}>Start Duel</button>: null}
                </div>
                <div>
                    {playerSelection ? <Card card={playerSelection}></Card> : null}
                </div>
            </div>
        );
    }

export default Arena;