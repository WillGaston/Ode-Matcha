const API_URL = "/matcha"

async function loadMatchas() {
  const res = await fetch(API_URL);
  const matchas = await res.json();

  const grid = document.getElementById("matcha-diary");
  grid.innerHTML = "";

  console.log("hi");
  console.log(matchas);

  matchas.forEach(element => {
    const diaryCard = document.createElement("div");
    diaryCard.className = "matcha-card";

    console.log(element);

    diaryCard.innerHTML = `
      <div class="card-div"></div>
      <div class="card-divider"></div>
      <div class="card-div">
        <h2>${element.date}</h2>
        <p><b>Type:</b> ${element.matchaType}</p>
        <p><b>Rating:</b> ${element.colourRating}/10</p>
        <p><b>Taste Rating:</b> ${element.tasteRating}/10</p>
      </div>
    `;

    console.log(diaryCard.innerHTML);
    grid.append(diaryCard);
  });
}

window.addEventListener("DOMContentLoaded", loadMatchas);