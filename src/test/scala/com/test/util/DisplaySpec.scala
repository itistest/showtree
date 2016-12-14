package com.test.util
import com.test.util
import com.test.util.data.structure.TreeNode


import collection.mutable.Stack
import org.scalatest._

class DisplaySpec extends FlatSpec with Matchers {

  "asciiDisplay" should "format TreeNode like below" in {
	Display.asciiDisplay(TreeNode("Root",
	      children = List(TreeNode("level1-1"),
	        TreeNode("level1-2"),
	        TreeNode("level1-3")))) should be 
				(List("+-Root", " +-level1-1", " +-level1-2"," +-level1-3"))
  }
  "asciiDisplay2" should "format TreeNode like below" in {
	Display.asciiDisplay(TreeNode("Root",
	  children = List(
	    TreeNode("level1-1",  children = List(
	    TreeNode("level1-1", children = TreeNode("level2-1", children = TreeNode("level3-1") :: Nil) :: Nil),
	    TreeNode("level1-2"),
	    TreeNode("level1-3"))),
	    TreeNode("level1-2"),
	    TreeNode("level1-3")))) should be 
				(List("+-Root"," +-level1-1"," | +-level1-1"," | | +-level2-1"," | |  +-level3-1"," | |"," | +-level1-2",
						" | +-level1-3"," |"," +-level1-2"," +-level1-3"))
  }
}