package com.test.util.data.structure
case class TreeNode[T](data: T, children: Seq[TreeNode[T]] = Nil)