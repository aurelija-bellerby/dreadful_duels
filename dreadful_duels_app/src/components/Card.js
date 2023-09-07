
const Card =({card})=>{


    return (
        <div>
            <ul>
            <li><img src={card.imgUrl}/></li>
            <li>{card.name}</li>
            <li>{card.attack}</li>
            <li>{card.defence}</li>
            <li>{card.description}</li>
            </ul>
        </div>
    )
}

export default Card;