package org.jbpt.graph.algo.rpst;

import java.util.ArrayList;
import java.util.Collection;

import org.jbpt.graph.abs.AbstractDirectedGraph;
import org.jbpt.graph.abs.IDirectedEdge;
import org.jbpt.graph.abs.IDirectedGraph;
import org.jbpt.graph.algo.tctree.TCType;
import org.jbpt.hypergraph.abs.IVertex;
import org.jbpt.hypergraph.abs.Vertex;


public class RPSTNode<E extends IDirectedEdge<V>, V extends IVertex> extends Vertex {

	private boolean isQuasi = false;

	private V entry = null;
	
	private V exit = null;
	
	private TCType type = TCType.UNDEFINED;
	
	private RPSTSkeleton<E,V> skeleton = new RPSTSkeleton<E,V>();
	
	private AbstractDirectedGraph<E,V> fragment = new AbstractDirectedGraph<E,V>();
	
	public boolean isQuasi() {
		return isQuasi;
	}
	
	public IDirectedGraph<E,V> getFragment() {
		return (IDirectedGraph<E,V>) this.fragment;
	}
	
	public Collection<IDirectedEdge<V>> getFragmentEdges() {
		Collection<IDirectedEdge<V>> result = new ArrayList<IDirectedEdge<V>>();
		
		for (E e : this.fragment.getEdges())
			result.add((IDirectedEdge<V>) e);
		
		return result;
	}

	protected void setQuasi(boolean isQuasi) {
		this.isQuasi = isQuasi;
	}
	
	public V getEntry() {
		return this.entry;
	}

	public void setEntry(V entry) {
		this.entry = entry;
	}

	public V getExit() {
		return this.exit;
	}

	public void setExit(V exit) {
		this.exit = exit;
	}
	
	public RPSTSkeleton<E,V> getSkeleton() {
		return this.skeleton;
	}
	
	public TCType getType() {
		return this.type;
	}
	
	protected void setType(TCType type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return (this.isQuasi ? "*" : "")+this.getName() + " [" + this.entry + "," + this.exit + "] - " + this.getSkeleton() + " - " + this.getSkeleton().getVirtualEdges() + " : " + this.getFragment();
	}

}
