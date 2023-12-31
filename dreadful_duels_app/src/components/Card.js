import styled from "styled-components";

const StyledCard = styled.div`
    position: relative;
    #card-frame {
        max-width: 180px;
    }
    #card-img {
        position: absolute;
        width: 135px;
        top: 56px;
        left: 23px;
    }
    #card-name {
        position: absolute;
        margin: 0px;
        text-align: right;
        font-size: 15px;
        color: white;
        font-family: "Times New Roman";
        width: 110px;
        top: 15px;
        left: 50px;
    }
    #card-description {
        position: absolute;
        margin: 0px;
        text-align: center;
        line-height: 1.2;
        top: 207px;
        left: 20px;
        font-size: 12px;
        color: black;
        font-family: "Times New Roman";
        width: 140px;
        font-style: italic;
    }
    #card-attack {
        position: absolute;
        top: 237px;
        left: 22px;
        font-size: 10px;
        color: black;
        max-width: 50px;
        margin: 0px;
        font-weight: bold;
    }
    #card-defence {
        position: absolute;
        top: 237px;
        left: 130px;
        font-size: 10px;
        color: black;
        max-width: 50px;
        margin: 0px;
        font-weight: bold;
    }
`

const Card =({card})=>{

    return (
        <StyledCard>
            <img id="card-frame" src="https://i.postimg.cc/KvCjHYkh/card-Template-Front-Finale.png" alt="card frame" />
            <img id="card-img" src={card.imgUrl} alt={card.name}/>
            <h3 id="card-name">{card.name}</h3>
            <p id="card-attack">⚔️ {card.attack}</p>
            <p id="card-defence">🛡️ {card.defence}</p>
            <p id="card-description">{card.description}</p>
        </StyledCard>
    )
}

export default Card;