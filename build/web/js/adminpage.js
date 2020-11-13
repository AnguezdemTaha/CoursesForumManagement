$(document).ready(function(){

var 
	$demands = $('#demands'),
        $add_student = $('#add_student'),
        $delete_student = $('#delete_student'),
        $add_teacher = $('#add_teacher'),
        $delete_teacher = $('#delete_teacher'),
        $add_model = $('#add_model'),
        $delete_model = $('#delete_model'),
        $add_branch = $('#add_branch'),
        
        
        $demands_block = $('#demands_block'),
        $add_student_block = $('#add_student_block'),
        $delete_student_block = $('#delete_student_block'),
        $add_teacher_block = $('#add_teacher_block'),
        $delete_teacher_block = $('#delete_teacher_block'),
        $add_model_block = $('#add_model_block'),
        $delete_model_block = $('#delete_model_block'),
        $add_branch_block = $('#add_branch_block');
	
	



var $menu_items =[$demands, $add_student, $delete_student, $add_teacher, $delete_teacher, $add_model, $delete_model, $add_branch];
var $block_items =[$demands_block, $add_student_block, $delete_student_block, $add_teacher_block, $delete_teacher_block, $add_model_block, $delete_model_block, $add_branch_block];


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
    				item.css('background', '#111');
    			}
			}
		);	
		//after if we have more elements we can do a list better
		sectionitem.css('background', '#55ACEE');	
		//show th curent clicked block
		block.css({
						'display':'block',
						/*'position': 'absolute',
  						'top': '20px',
  						'left': '0',
  						
 						'color': 'white',
  						'padding-left': '20px',
  						'padding-right': '20px',
  						
  						'font-family': 'Arial, Helvetica, sans-serif',
  						'font-size': 'large'*/
  					});
}




});