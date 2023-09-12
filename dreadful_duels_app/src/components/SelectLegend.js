import React, {useState} from "react";
function SelectLegend({legends, onSubmit}){
    const [legendOption, setLegendOption] = useState(legends[0]);
    const [playerInput, setPlayerInput] = useState('');

    function handleFormSubmit(evt) {
      evt.preventDefault();
      setLegendOption(evt.target[1].value)
      onSubmit(evt.target[1].value, playerInput);
    }

    function onLegendSelected(legend) {
      setLegendOption(legend);
    }

    return<>
       <form onSubmit={handleFormSubmit}>
          
          <label htmlFor="player">What is your name Mighty Duelist ?</label>
          <input
            type="text"
            id="player"
            name="player"
            placeholder="e.g Magician Of Azgard"
            value={playerInput}
            onChange={(evt) => setPlayerInput(evt.target.value)}
          />
          
          <label for="legend">Choose Your Enemy !</label>
          <select name='legends-dropdown'>
            {legends.map(function(legend) {
              return <option value={legend}>{legend}</option>
            })}
          </select>

          <input type="submit"/>
        </form >
    </>
}

export default SelectLegend;