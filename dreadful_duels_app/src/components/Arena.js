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

    if(playerSelection != null && computerSelection != null) {
        return (
         <div>
            <Card card={computerSelection}></Card>
            <Card card={playerSelection}></Card>
            <button onClick={handleDuel}>Start Duel</button>
         </div>
        );
    }
}

export default Arena;