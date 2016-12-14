package com.test.util

import com.test.util.data.structure.TreeNode

object Display{
	def asciiDisplay(root: TreeNode[String]): Seq[String] = {
		asciiDisplayUtil(root, null, "")
	}

	private def asciiDisplayUtil(root: TreeNode[String], brother: TreeNode[String], prefix: String): Seq[String] = {
		var resultList = List(prefix + "+-" + root.data)

		var i = 0
		val size = root.children.size 

		root.children.foreach(x =>{
			var childBrother:TreeNode[String] = null
			if (i < size - 1) {
				childBrother =  root.children(i + 1)
			}
			if (brother != null) {
				resultList = resultList ++ asciiDisplayUtil(x, childBrother, prefix + "| ") 
			} else {
				resultList =  resultList ++ asciiDisplayUtil(x, childBrother, prefix + " ") 
			}
			
			i = i + 1
		})
			
		if (brother != null && size > 0) {
			resultList = resultList :+ prefix + "| "
		}                  
		resultList
	}
}