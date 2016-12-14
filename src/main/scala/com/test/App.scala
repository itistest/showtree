package com.test

import com.test.util.Display
import com.test.util.data.structure.TreeNode


object App extends App{

  override def main(args: Array[String]) = {
  	List(1,2,3).foreach(println(_))
		Display.asciiDisplay(TreeNode("Root",
		      children = List(TreeNode("level1-1"),
		        TreeNode("level1-2"),
		        TreeNode("level1-3")))).foreach(println)
		Display.asciiDisplay(TreeNode("Root",
  children = List(
    TreeNode("level1-1",  children = List(
    TreeNode("level1-1", children = TreeNode("level2-1", children = TreeNode("level3-1") :: Nil) :: Nil),
    TreeNode("level1-2"),
    TreeNode("level1-3"))),
    TreeNode("level1-2"),
    TreeNode("level1-3")))).foreach(println)
  }
}