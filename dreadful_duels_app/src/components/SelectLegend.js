import React, {useState} from "react";
function SelectLegend({legends, updateNames, addCardsToDeck}){
    const [legendOption, setLegendOption] = useState(legends[0]);
    const [playerInput, setPlayerInput] = useState('');

    function handleFormSubmit(evt) {
      evt.preventDefault();
      setLegendOption(evt.target[1].value)
      console.log(evt.target[1].value, playerInput)
      updateNames(evt.target[1].value, playerInput);
      addCardsToDeck()
    }

    return(
      <div>
        <form onSubmit={handleFormSubmit} className="flex flex-col gap-y-7 place-items-center text-3xl font-serif text-neutral-200 drop-shadow-[0_3px_3px_rgba(0,0,0,5)]" >
            <label htmlFor="player">What is your name, Mighty Duelist ?</label>
            <input
              type="text"
              id="player"
              name="player"
              placeholder="e.g Wizard of Azgard"
              value={playerInput}
              onChange={(evt) => setPlayerInput(evt.target.value)}
              className="bg-transparent text-center"
            />
            
            <label for="legend">Choose Your Enemy !</label>
            <select name='legends-dropdown' className="bg-transparent text-center">
              {legends.map(function(legend) {
                return <option className="text-center" value={legend}>{legend}</option>
              })}
            </select>

            <input
              type="submit"
              value=" Start New Game "
              className="p-5 rounded-3xl bg-zinc-500 hover:bg-cyan-800"
              />
          </form >
      </div>)
}

export default SelectLegend;