package org.antlr.v4.runtime.tree.xpath;

import org.antlr.v4.runtime.tree.ParseTree;

import java.util.Collection;

/** Either ID at start of path or ...//ID in middle of path */
public class XPathAnywhereElement extends XPathElement {
	public XPathAnywhereElement(String nodeName) {
		super(nodeName);
	}

	@Override
	public Collection<? extends ParseTree> evaluate(ParseTree t) {
		return null;
	}
}
