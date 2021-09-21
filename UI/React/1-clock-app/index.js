let inndianClock = document.getElementById('indianClock');
let dubaiClock = document.getElementById('dubaiClock');
let usaClock = document.getElementById('americanClock');

let inndianClockV1 = document.getElementById('indianClockV1');
let dubaiClockV1 = document.getElementById('dubaiClockV1');
let usaClockV1 = document.getElementById('americanClockV1');


function jsClock(props) {
  
    let time = new Date().toLocaleTimeString(props.lang,props.zone);

    return (
        `
        <div class='card'>
            <div class='card-header bg-info'> 
                <span>${props.zone.timeZone}</span>
            </div>
            <div class='card-body'>
                <p class='card-text'> ${time}</p>
            </div>
        </div>
        `
    )
}


function reactClock(props) {
  
    let time = new Date().toLocaleTimeString(props.lang,props.zone);

    return (
        // JSX : java Script Extension
        <div class='card'>
            <div class='card-header bg-success'> 
                <span>{props.zone.timeZone}</span>
            </div>
            <div class='card-body'>
                <p class='card-text'>{time}</p>
            </div>
        </div>
        
    )
}

setInterval(function () {
    
    indianClock.innerHTML = jsClock({lang:'en-FR',zone:{timeZone:'asia/kolkata'}});
    dubaiClock.innerHTML = jsClock({lang:'en-US',zone:{timeZone:'asia/dubai'}});
    usaClock.innerHTML = jsClock({lang:'en-US',zone:{timeZone:'america/new_york'}});

    //-------------------------------------

    ReactDOM.render(reactClock({lang:'en-US',zone:{timeZone:'asia/kolkata'}}),inndianClockV1);
    ReactDOM.render(reactClock({lang:'en-US',zone:{timeZone:'asia/dubai'}}),dubaiClockV1);
    ReactDOM.render(reactClock({lang:'en-US',zone:{timeZone:'america/new_york'}}),usaClockV1);

}, 1000);

