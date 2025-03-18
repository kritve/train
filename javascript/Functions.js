function ask(q, y ,n){
    if(confirm(q)) y()
        
    else n()
}

function showOk() {
    console.log("User agreed")
}

function showCancel() {
    console.log("User cancelled")
}

ask("Do you agree?", showOk, showCancel)