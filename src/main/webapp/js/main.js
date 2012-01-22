$(function(){
				
    var dropped = false;
    var draggable_sibling;
   				
    var gallery_top = $( "#leftcontainer" );
    gallery_top.sortable({
        start: function(event, ui) {
            draggable_sibling = $(ui.item).prev();
        },
        stop: function(event, ui) {
            if (dropped) {
                if (draggable_sibling.length == 0)
                    $('#sortable').prepend(ui.item);

                draggable_sibling.after(ui.item);
                dropped = false;
            }
        }
    });//.disableSelection();
				
    var gallery_bottom = $( "#rightcontainer" );
    gallery_bottom.sortable();//.disableSelection();

    /*$(".imwidget", gallery_top).draggable(
				  { 
					helper:"clone", 
					cursor:"move",
					revert: "invalid"
			       }
				);*/
				
				
    gallery_bottom.droppable({
        accept1: "#sortable_top > div",
        activeClass: "ui-state-highlight",
        drop: function( event, ui ) {
            console.log("Add item to right");
            console.log(ui);
            ui.gallery_bottom
        //gallery_bottom.append(ui);
        //ui.appendTo( gallery_bottom );
        //gallery_bottom.sortable();
        //deleteImage( ui.draggable );
        }
    });
				
				
/*gallery_top.droppable({
					accept: "#sortable_bottom > div",
					activeClass: "ui-state-highlight",
					drop: function( event, ui ) {
						console.log("add item to left");
						console.log(ui);
						//ui.appendTo( gallery_top );
						//gallery_top.sortable();
						//deleteImage( ui.draggable );
					}
				}); */
				
				
				
				
				
});

