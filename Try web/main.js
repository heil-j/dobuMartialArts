$(document).ready(function() {
    $('.nav-link').on('click', function(event) {
        event.preventDefault();
        var target = $(this.hash);
        if (target.length) {
            var scrollTo = target.offset().top;
            $('html, body').animate({
                scrollTop: scrollTo
            }, 800, function() {
                window.location.hash = target.attr('id');
            });
        }
    });
});