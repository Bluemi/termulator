package math.containers;

import math.propositions.Proposition;

public interface PropositionContainer
{
	public void setProposition(Proposition proposition, int index);
	public Proposition getProposition(int index);
	public Proposition[] getPropositions();
}
