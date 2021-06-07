$("#submit").on("click", () => {
    $.ajax({
        method: "POST",
        url: "/users/add",
        data: JSON.stringify(userObject()),
        contentType: "application/json",
        crossDomain: true,
        xhrFields: { withCredentials: true },
        success: (response, status, xhr) => {
            alert(`SUCCESS: ${response}`);
            console.log(xhr.getResponseHeader('Set-Cookie'))
            console.log(response)
            console.log(xhr);
        },
        error: err => {
            let errorObj = err.responseJSON;
            alert(`ERROR: "${errorObj.message}" \nTIME: ${errorObj.time}`);
        }
    });
});

const userObject = () => {
    return {
        name: $("#username").val()
    };
};