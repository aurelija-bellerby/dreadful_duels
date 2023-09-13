import Card from "./Card";

function Arena({playerSelection, computerSelection, handleWinner}){

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
                <div></div>
                <div className="justify-self-center">
                    {computerSelection ? <Card card={computerSelection}></Card> : null}
                </div>
                <div className="justify-self-center text-3xl ">
                    {playerSelection ?<button onClick={handleDuel} className="bg-red-900 p-5 rounded-3xl drop-shadow-[0_3px_3px_rgba(0,0,0,5)]" >Start Duel </button>: null}
                </div>
                <div className="justify-self-center">
                    {playerSelection ? <Card card={playerSelection}></Card> : null}
                </div>
            </div>
        );
    }

export default Arena;