console.log("Welcome to the Community Portal");

// ====== Basic Page Events ======
function validatePhone(field) {
  const value = field.value;
  if (!/^\d{10}$/.test(value)) {
    alert("Enter a valid 10-digit phone number");
  }
}

function displayFee(select) {
  document.getElementById("feeDisplay").textContent = `Fee: $${select.value}`;
}

function showConfirmation() {
  document.getElementById("formOutput").value = "Registration Submitted!";
}

function enlargeImage(img) {
  img.style.width = img.style.width === "200px" ? "100px" : "200px";
}

function countChars(textarea) {
  document.getElementById("charCount").textContent = textarea.value.length;
}

function videoReady() {
  document.getElementById("videoStatus").textContent = "Video ready to play";
}

window.onbeforeunload = function () {
  return "You have unsaved changes.";
};

// ====== Preferences ======
function savePreference(select) {
  localStorage.setItem("preferredEvent", select.value);
  document.getElementById("preferenceStatus").textContent = "Preference saved!";
}

function loadPreference() {
  const preferred = localStorage.getItem("preferredEvent");
  if (preferred) {
    document.getElementById("eventType").value = preferred;
    document.getElementById("preferredEvent").value = preferred;
  }
}

function clearPreferences() {
  localStorage.clear();
  sessionStorage.clear();
  document.getElementById("preferenceStatus").textContent = "Preferences cleared.";
}

// ====== Geolocation ======
function getLocation() {
  if (navigator.geolocation) {
    navigator.geolocation.getCurrentPosition(
      (position) => {
        document.getElementById("locationOutput").textContent =
          `Latitude: ${position.coords.latitude}, Longitude: ${position.coords.longitude}`;
      },
      (error) => {
        document.getElementById("locationOutput").textContent =
          `Error: ${error.message}`;
      },
      { enableHighAccuracy: true, timeout: 10000 }
    );
  } else {
    alert("Geolocation is not supported by this browser.");
  }
}

// ====== Extras (Optional Learning Examples) ======
const events = [
  { name: "Music Night", date: "2025-06-20", seats: 0 },
  { name: "Art Fair", date: "2025-07-01", seats: 5 }
];

events.forEach(event => {
  const isUpcoming = new Date(event.date) > new Date();
  if (isUpcoming && event.seats > 0) {
    console.log(`Available: ${event.name} on ${event.date}`);
  }
});

function tryRegister(event) {
  try {
    if (event.seats > 0) {
      event.seats--;
      console.log("Successfully registered.");
    } else {
      throw new Error("Event is full");
    }
  } catch (error) {
    console.error(error.message);
  }
}

function createCategoryCounter(category) {
  let count = 0;
  return function () {
    count++;
    console.log(`Registrations for ${category}: ${count}`);
  };
}

const musicCounter = createCategoryCounter("Music");
