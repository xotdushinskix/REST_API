/**
 * Created by nikita on 28.09.16.
 */
$(document).ready(function() {
    $.ajax({
        url: "http:git//localhost:8083/users"
    }).then(function(data) {
        $('.greeting-id').append(data.id);
        $('.greeting-content').append(data.content);
    });
});
