package com.paracamplus.ilp2.ilp2tme4.parser.ilpml2;

import com.paracamplus.ilp1.ast.ASTexpression;
import com.paracamplus.ilp1.interfaces.IASTexpression;
import com.paracamplus.ilp1.interfaces.IASTvisitor;

public class ASTunless extends ASTexpression implements IASTunless{
	
	protected IASTexpression condition;
	protected IASTexpression body;
	
	public ASTunless(IASTexpression condition, IASTexpression body) {
		this.condition=condition;
		this.body=body;
	}

	@Override
	public <Result, Data, Anomaly extends Throwable> Result accept(IASTvisitor<Result, Data, Anomaly> visitor,
			Data data) throws Anomaly {
		return ((com.paracamplus.ilp2.ilp2tme4.parser.ilpml2.IASTvisitor<Result, Data, Anomaly>) visitor).visit(this, data);
	}

	@Override
	public IASTexpression getBody() {
		return body;
	}

	@Override
	public IASTexpression getCondition() {
		return condition;
	}

}
