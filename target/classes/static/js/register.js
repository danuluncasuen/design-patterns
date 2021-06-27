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
            window.location.href="/progress"
        },
        error: err => {
            alert(err);
        }
    });
});

const userObject = () => {
    return {
        username: $("#username").val()
    };
};