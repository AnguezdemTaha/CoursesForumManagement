$(document).ready(function(){

var $notification_block = $('#notification_block'),
	$notification = $('.notification');

var $participation = $('.participation'),
	$participation_icon = $('.participation_icon');

var $more_text = $('#more_text'),
	$dots = $('#dots'),
	$showmoreless_button = $('#showmoreless_button');

var $comments = $('.comments'),
	$comments_block = $('.comments_block');

var $modal =$('#id01'),
	$sittings_button=$('.sittings_button'),
	$modal_content1=$('.modal-content1');
        
var $modal2 =$('#id02'),
	$addcours_button=$('.addcours_button'),
	$modal_content2=$('.modal-content2');



var $editname_button =$('.editname_button'),
	$editpassword_button=$('.editpassword_button'),
	$editemail_button=$('.editemail_button'),
	$name_block=$('.name_block'),
	$password_block=$('.password_block'),
	$email_block=$('.email_block'),
	$editname_block=$('.editname_block'),
	$editpassword_block=$('.editpassword_block'),
	$editemail_block=$('.editemail_block'),
	$cancel_name=$('.cancel_name'),
	$cancel_password=$('.cancel_password'),
	$cancel_email=$('.cancel_email');


var $report_button=$('.report_button'),
	$reportevent_block=$('#reportevent_block');
//this lists on same indix capablity
var $editbuttons_list=[$editname_button,$editpassword_button,$editemail_button];
	$editblock_list=[$editname_block,$editpassword_block,$editemail_block];
	$block_list=[$name_block,$password_block,$email_block];

	$cancelbuttons_list=[$cancel_name,$cancel_password,$cancel_email];



//over floww only if hight passed the max 
if($modal_content1.height()<=400){

	$modal_content1.css('overflow','hidden');
}
else{
	console.log("wtff");
}




$notification.click(function(e) {
  console.log("111");
  if($notification_block.css('display')=="block"){
  	console.log("fct boton entered");
  	$notification_block.css('display','none');
  	}
  else{
  	if($notification_block.css('display')=="none"){
  		console.log("33");
  		$notification_block.css('display','block');
  			
  		}
 	}	

});


/* to see : a fct to delate notification_block if click other place
$(window).click(function(e) {
	if($notification_block.css('display')=="block"){
		if (e.target != $notification_block) {
    		$notification_block.css('display','none');
  		}
  	}
});
*/

/*like dislike button : participation */
$participation.click(function(e) {
	$participation_icon.toggleClass("fa-thumbs-down");
});

$showmoreless_button.click(function(e) {
	if ($dots.css('display') == "none") {
    	$dots.css('display', 'inline');
    	$showmoreless_button.html("Read more");
    	$more_text.css('display', 'none');
  	} else {
    	$dots.css('display', 'none');
    	$showmoreless_button.html("Read less");
    	$more_text.css('display', 'inline');
  	}
});


//comments def color :#555
$comments.click(function(e) {
  
  if($comments_block.css('display')=="block"){
  	$comments_block.css('display','none');
  	$comments.css('background-color', '#555');
  	$comments.html("button to show comments");
  	}
  else{
  	if($comments_block.css('display')=="none"){
		$comments_block.css('display','block');
		$comments.css('background-color', '#55ACEE');
		$comments.html("click if you cant hide coms");
  			
  		}
 	}	

});

//modal display

$sittings_button.click(function(e) {
	$modal.css('display','block');
});

$addcours_button.click(function(e) {
        e.preventDefault()
	$modal2.css('display','block');
});



/*list form */
$editbuttons_list.forEach(//fct:
	eventlisten
	);

function eventlisten(item, index) {
  //document.getElementById("demo").innerHTML += index + ":" + item + "<br>";
  console.log("foreatc fct entred");
  
  item.click(function(e){
    console.log("item clicked just wowoowow");
    var $editblock_item_correspond=$editblock_list[index],
    	$block_item_correspond=$block_list[index]
    
    	goonsection($block_item_correspond,$editblock_item_correspond);

	});
}

function goonsection(block,editblock) {
	console.log("fromsectiontoanother entred !!!" );
		
    	if(editblock.css('display')=="none"){
    		editblock.css('display','block');
    		block.css('display','none');
    	}
}
//cancel buttons now 

$cancelbuttons_list.forEach(//fct:
	
	eventlisten1
	);

function eventlisten1(item, index) {
  //document.getElementById("demo").innerHTML += index + ":" + item + "<br>";
  console.log("foreatc fct entred");
  
  item.click(function(e){
  	event.preventDefault()
    
    var $editblock_item_correspond=$editblock_list[index],
    	$block_item_correspond=$block_list[index]
    
    	goonsection1($block_item_correspond,$editblock_item_correspond);

	});
}

function goonsection1(block,editblock) {
	console.log("cancel sss" );
		
    	if(block.css('display')=="none"){
    		block.css('display','block');
    		editblock.css('display','none');
    	}
    }

$report_button.click(function(e) {
	if ($reportevent_block.css('display') == "none") {
    	
    	$reportevent_block.css('display', 'block');
  	} else {
    	$reportevent_block.css('display', 'none');
    	
  	}
});

});