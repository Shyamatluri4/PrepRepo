let boxbuts = document.querySelectorAll(".box");
let rbut = document.querySelector("#reset");
let msgcontainer = document.querySelector("#msg-container");
let newbut = document.querySelector("#new");
let msg = document.querySelector("#msg");

let turnX = true;

const winpatterns = [
  [0,1,2],
  [0,3,6],
  [0,4,8],
  [1,4,7],
  [2,5,8],
  [2,4,6],
  [3,4,5],
  [6,7,8]
];

const resetGame = ()=>{
    turnX=true;
    enableboxes();
    msgcontainer.classList.add("hide");
};

boxbuts.forEach((box) => {
  box.addEventListener("click",()=>{
    console.log("box clicked");
    if(turnX){
      box.innerText = "X";
      turnX=false;
    }
    else{ 
      box.innerText = "O";
      turnX=true;
    }

    box.disabled = true;

    checkWinner();
  })
});

const disableboxes = ()=>{
  for(let box of boxbuts){
    box.disabled = true;
  }
};

const enableboxes = ()=>{
  for(let box of boxbuts){
    box.disabled = false;
    box.innerText = "";
  }
};

const showWinner = (winner)=>{
  msg.innerText = `Congratulations! Winner is ${winner}`;
  msgcontainer.classList.remove("hide");
  disableboxes();
};

const checkWinner = ()=>{
  for(let pattern of winpatterns){
    let pos1 = boxbuts[pattern[0]].innerText;
    let pos2 = boxbuts[pattern[1]].innerText;
    let pos3 = boxbuts[pattern[2]].innerText;

    if(pos1 != "" && pos2 != "" && pos3 != ""){
      if(pos1==pos2 && pos2==pos3){
        console.log("player",pos1,"is the winner");
        showWinner(pos1);
      }
    }
  }
};

newbut.addEventListener("click",resetGame);
rbut.addEventListener("click",resetGame);