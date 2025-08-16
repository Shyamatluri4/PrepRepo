const BASE_URL = "https://v6.exchangerate-api.com/v6/2a5b1a92fb64b858e80b4ea8";

const dropdowns = document.querySelectorAll(".dropdown select");
const btn = document.querySelector("form button");
const base = document.querySelector(".from select");
const target = document.querySelector(".to select");
const msg = document.querySelector(".msg");
const finalmsg = document.querySelector("#finalmsg");


for(let select of dropdowns){
    for(let currCode in countryList){
        let newOption = document.createElement("option");
        newOption.innerText = currCode;
        newOption.value = currCode;
        if(select.name === "from" && currCode==="USD"){
            newOption.selected="selected";
        }
        else if(select.name === "to" && currCode==="INR"){
            newOption.selected="selected";
        }
        select.append(newOption);
    }

    select.addEventListener("change",(evt)=>{
        updateFlag(evt.target);
    });
}

const updateFlag = (element)=>{
    let currCode = element.value;
    let countryCode = countryList[currCode];
    let newSrc = `https://flagsapi.com/${countryCode}/shiny/64.png`;
    let img = element.parentElement.querySelector("img");
    img.src = newSrc;
};

btn.addEventListener("click",async(evt)=>{
    evt.preventDefault();
    let amount = document.querySelector(".amount input");
    let amt = amount.value;
    if(amt==="" || amt<1){
        alert("Enter a valid number");
        amount.value=1;
    }
    
    const URL = `${BASE_URL}/pair/${base.value}/${target.value}/${amt}`;
    let response = await fetch(URL);
    let data = await response.json();
    let rate = data.conversion_rate;
    let exchangeRate = data.conversion_result;
    msg.innerText = `1 ${base.value} = ${rate}${target.value}`;
    finalmsg.innerText = `${amt} ${base.value} = ${exchangeRate} ${target.value}`;
});
