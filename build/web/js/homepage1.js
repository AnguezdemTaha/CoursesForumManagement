/* Set the width of the side navigation to 250px and the left margin of the page content to 250px and add a black background color to body */

$(document).ready(function(){

var $menu_button = $('.menu_button'),
	$mySidenav = $('#mySidenav'),
	$main = $('#main'),
	$home_website=$('.home-website'),
	$about_website=$('.about-website'),
	$services_website=$('.services-website'),
	$home_block=$('.home-block'),
	$about_block=$('.about-block'),
	$services_block=$('.services-block');


var $modal =$('#id01'),
	$register_signin = $('#register-signin'),
	$registersignin_list=$('.registersignin_list'),
	$register=$('#register'),
	$login=$('#login'),
	$forget_pass=$('#forget_pass'),
	$register_button=$(".register_button"),
	$forget_pass_button=$(".forget_pass_button"),
	$login_button=$(".login_button");

//every menu_item have same index as his block_item
var $menu_items =[$home_website, $about_website, $services_website];
var $block_items =[$home_block, $about_block, $services_block];

$menu_button.click(function(e){
    console.log("clokc detected");
    opencloseNav();
});

/*$about_website.click(function(e){
    console.log("about_page clicked");
    gotosection($about_website);
});*/

/*we make all menu items in on lister to make lisninig events more eazyst*/
$menu_items.forEach(//fct:
	eventlisten
	);

function eventlisten(item, index) {
  //document.getElementById("demo").innerHTML += index + ":" + item + "<br>";
  console.log("foreatc fct entred");
  item.click(function(e){
    console.log("item clicked just wowoowow");
    var $block_item_correspond=$block_items[index];
    goonsection(item,$block_item_correspond);

	});
}

/* old function
function choseblock(section) {
	if(section==$about_website){
		console.log("focntion about entred if" );
		$home_block.css('display','none');
		//after if we have more elements we can do a list better
		$about_website.css('background', '#55ACEE');
		$home_website.css('background', '#111');
		$about_block.css({
						'display':'block',
						'position': 'absolute',
  						'top': '20px',
  						'left': '0',
  						
 						'color': 'white',
  						'padding-left': '20px',
  						'padding-right': '20px',
  						
  						'font-family': 'Arial, Helvetica, sans-serif',
  						'font-size': 'large'});
	}

}
*/
function goonsection(sectionitem,block) {
	console.log("fromsectiontoanother entred !!!" );
		//make other blocks hidden
		$block_items.forEach(//fct:
			function(item, index){
    			if(item != block){
    				item.css('display','none');
    			}
			}
		);	
		//black bakcround color for other menu items
		$menu_items.forEach(//fct:
			function(item, index){
    			if(item != sectionitem){
                            //console.log("size text :"+item.css('font-size'));
    				item.css('font-size', '14px');
    			}
			}
		);	
		//after if we have more elements we can do a list better
		//sectionitem.css('background', '#55ACEE');
                sectionitem.css('font-size','25px');
		//show th curent clicked block
		block.css({
						'display':'block',
						'position': 'absolute',
  						'top': '20px',
  						'left': '0',
  						
 						'color': 'white',
  						'padding-left': '20px',
  						'padding-right': '20px',
  						
  						'font-family': 'Arial, Helvetica, sans-serif',
  						'font-size': 'large'});
}

function opencloseNav() {
if($mySidenav.css('width')=="0px"){
	console.log("==0");
  $mySidenav.css('width','250px');
  $main.css('marginLeft','250px');
  document.body.style.backgroundColor = "rgba(0,0,0,0.4)";}
 else{
 	console.log($mySidenav.css('width'));
  	$mySidenav.css('width','0');
  	$main.css('marginLeft','0');
  	document.body.style.backgroundColor = "white";
  		}
 }


 $(window).click(function(e) {
  console.log("fct entered");
  if (e.target == $mySidenav) {
  	console.log("if entred");
    $mySidenav.css('width','0');
  	$main.css('marginLeft','0');
  	document.body.style.backgroundColor = "white";
  }
});


$register_signin.click(function(e) {
  console.log("fct boton entered");
  $modal.css('display','block');
  	
  
});
//il faut rendre c'est fct plus generique : on click toujour des boton pouf display nonn/block
 $(window).click(function(e) {
  console.log("fct modal entered");
  if (e.target == $modal) {
  	console.log("if modal entred");
    $modal.css('display','none');
  	
  }
});


//register + login
 $register_button.click(function(e) {
  
    $register.css('display','block');
    $login.css('display','none');
  	$forget_pass.css('display','none');
  
});

 $login_button.click(function(e) {
  
  
  	
    $login.css('display','block');
    $register.css('display','none');
    $forget_pass.css('display','none');
  	
  
});

 $forget_pass_button.click(function(e) {
  
  
  	$forget_pass.css('display','block');
    $login.css('display','none');
    $register.css('display','none');
  	
  
});
 

  





});



/*
function openNav() {
  document.getElementById("mySidenav").style.width = "250px";
  document.getElementById("main").style.marginLeft = "250px";
  document.body.style.backgroundColor = "rgba(0,0,0,0.4)";
  

}*/

/* Set the width of the side navigation to 0 and the left margin of the page content to 0, and the background color of body to white */
function closeNav() {
  document.getElementById("mySidenav").style.width = "0";
  document.getElementById("main").style.marginLeft = "0";
  document.body.style.backgroundColor = "white";
}