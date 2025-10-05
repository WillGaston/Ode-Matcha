const API_URL = "/matcha"

async function loadMatchas() {
  const res = await fetch(API_URL);
  const matchas = await res.json();

  const grid = document.getElementById("matcha-diary");
  grid.innerHTML = "";

  matchas.forEach(element => {
    const diaryCard = document.createElement("div");
    diaryCard.className = "matcha-card";

    diaryCard.innerHTML = `
      <div class="card-div-left"></div>
      <div class="card-divider"></div>
      <div class="card-div-right">
        <h2>${element.date}</h2>
        <p><b>Type:</b> ${element.matchaType}</p>
        <p><b>Rating:</b> ${element.colourRating}/10</p>
        <p><b>Taste Rating:</b> ${element.tasteRating}/10</p>
        <button class="details-button">View Details ></button>
      </div>
    `;

    grid.append(diaryCard);

    const detailsButton = diaryCard.querySelector(".details-button");

    detailsButton.addEventListener("click", () => {
      showPopup(element);
    });
  });

  function showPopup(element) {
    const popup = document.createElement("div");
    popup.className = "popup-div";
    popup.innerHTML = `
      <h2>${element.date}</h2>
      <h3>Matcha Details</h3>
      <p><b>Type:</b> ${element.matchaType}</p>
      <h3>Essentials</h3>
      <p><b>Matcha Amount (g):</b> ${element.matchaAmount}</p>
      <p><b>Water Amount (g):</b> ${element.waterAmount}</p>
      <p><b>Milk Amount (g):</b> ${element.milkAmount}</p>
      <p><b>Milk Type:</b> ${element.milkType}</p>
      <h3>Additional Data</h3>
      <p><b>Sweetener Amount (g):</b> ${element.sweetenerAmount}</p>
      <p><b>Sweetener Type:</b> ${element.sweetenerType}</p>
      <p><b>Ice Amount (# cubes):</b> ${element.iceAmount}</p>
      <p><b>Separation:</b> ${element.separation}</p>
      <h3>Review</h3>
      <p><b>Colour:</b> ${element.colourRating}/10</p>
      <p><b>Taste Rating:</b> ${element.tasteRating}/10</p>
      <p><b>Notes:</b> ${element.notes}</p>
      <button class="popup-close">Close</button>
    `;

    document.body.append(popup);

    popup.querySelector(".popup-close").addEventListener("click", () => {
      popup.remove();
    });
  }
}

async function addPopUp() {

  showPopup();

  function showPopup(element) {
    const popup = document.createElement("div");
    popup.className = "popup-div";
    popup.innerHTML = `
      <div class="button-div">
        <button class="popup-add">Add</button>
        <button class="popup-close">Close</button>
      </div>
    `;

    document.body.append(popup);

    popup.querySelector(".popup-close").addEventListener("click", () => {
      popup.remove();
    });
  }
}

const newMatchaButton = document.querySelector(".new-matcha-button");
newMatchaButton.addEventListener("click", () => {
  addPopUp();
});

window.addEventListener("DOMContentLoaded", loadMatchas);