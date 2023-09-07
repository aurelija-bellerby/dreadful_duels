const Results = ({playerScore,computerScore}) => {
    
//     const showResult = ()=>{
//     if (playerScore > computerScore){
//         return <h1>Player Wins !</h1>
//     }
//     else if (playerScore < computerScore){
//         return <h1>Computer Wins !</h1>
//     }else {
//         return <h1>It's A Draw !</h1>
//     }
// }
    return <>
        { playerScore > computerScore ? <h1>Player Wins !</h1> : null }
        { playerScore < computerScore ? <h1>Computer Wins !</h1> : null }
        { playerScore === computerScore ? <h1>It's A Draw !</h1> : null }
    </>
}
export default Results;