package com.paracamplus.ilp2.ilp2tme4.parser.ilpml2;

public interface IASTvisitor<Result, Data, Anomaly extends Throwable>
extends com.paracamplus.ilp2.interfaces.IASTvisitor<Result, Data, Anomaly> {

	Result visit(IASTunless iast, Data data) throws Anomaly;
}
