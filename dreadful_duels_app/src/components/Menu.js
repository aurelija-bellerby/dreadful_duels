import React from 'react'
import SelectLegend from './SelectLegend'
import styled from 'styled-components'

const StyledHeading = styled.h1`
    font-family: "MedievalSharp";
    margin-bottom: 10rem;
`

function Menu({legends , updateNames, addCardsToDeck}) {
  return (
    <div style={{
        backgroundImage: `url("https://i.postimg.cc/KvC5Rt18/Slidesdocs-game-scene-landscape-nature-28e2f28b30.jpg")`,
        backgroundPosition: `center`,
        backgroundSize: `cover`,
        backgroundRepeat: `no-repeat`
        }}>
        <div className='flex flex-col justify-center align-middle place-items-center min-h-screen'>
            <StyledHeading className='text-8xl text-neutral-200 drop-shadow-[0_5px_5px_rgba(0,0,0,5)]'>Dreadful Duels</StyledHeading>
            <SelectLegend legends={legends} onSubmit={updateNames} addCardsToDeck={addCardsToDeck}/>
        </div>
    </div>
  )
}

export default Menu
