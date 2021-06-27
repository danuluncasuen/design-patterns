$(document).ready(() => {
    $.ajax({
            method: "GET",
            url: "/users/progress",
            xhrFields: {
                  withCredentials: true
            },
            success: (response, status, xhr) => {
                alert(`SUCCESS`);
            },
            error: err => {
                alert(err);
            }
    });
});