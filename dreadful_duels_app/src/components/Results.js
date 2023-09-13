import styled from 'styled-components';

const Result = styled.h1`
    font-family: "MedievalSharp";
`

const Results = ({playerScore,computerScore}) => {

    return(
        <div className="text-8xl text-neutral-200 drop-shadow-[0_5px_5px_rgba(0,0,0,5)]">
            { playerScore > computerScore ? <Result>Victory</Result> : null }
            { playerScore < computerScore ? <Result>Defeat</Result> : null }
            { playerScore === computerScore ? <Result>Draw</Result> : null }
        </div>
    )
}
export default Results;