let userScore = 0;
let compScore = 0;

const msg = document.querySelector("#msg");

const btns = document.querySelectorAll(".choice");
const uscore = document.querySelector("#user-score");
const cscore = document.querySelector("#comp-score");

const choices = ["rock","paper","scissors"];

btns.forEach((c)=>{
    c.addEventListener("click",()=>{
        const userChoice = c.getAttribute("id");
        const compChoice = choices[Math.floor(Math.random() * 3)];
        console.log("user choice =",userChoice,"computer choice =",compChoice);
        checkWinner(userChoice,compChoice);
    });
});

const checkWinner = (userChoice,compChoice)=>{
    if(userChoice==compChoice){
        console.log("Draw");
        msg.innerText="DRAw";
    }

    if((userChoice==="paper" && compChoice==="rock") || (userChoice==="rock" && compChoice==="scissors") || (userChoice==="scissors" && compChoice==="paper")){
        msg.innerText="YOU WIN";
        msg.style.backgroundColor = "green";
        console.log("You win");
        userScore++;
        uscore.innerText= userScore;
    }
    else{
        msg.innerText="YOU LOSE";
        msg.style.backgroundColor = "red";
        console.log("Computer wins");
        compScore++;
        cscore.innerText= compScore;
    }
}
