import React,{useState, useEffect} from "react";
import './App.css';



function App() {

  const [cards, setCards] = useState([])

  useEffect(()=>{
    getCards();
  },[])

  const getCards = async function(){
    const res = await fetch("/cards") 
    const data = await res.json()
    setCards(data)
  }
  return (
    <div>
    </div>
  );
}

export default App;
