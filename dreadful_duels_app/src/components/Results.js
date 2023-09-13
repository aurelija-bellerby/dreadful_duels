const Results = ({playerScore,computerScore}) => {

    return(
        <div className="justify-self-center">
            { playerScore > computerScore ? <h1>Player Wins !</h1> : null }
            { playerScore < computerScore ? <h1>Computer Wins !</h1> : null }
            { playerScore === computerScore ? <h1>It's A Draw !</h1> : null }
        </div>
    )
}
export default Results;