export class NumberOutput {

    n: number;
    result: number;

    constructor(private _n: number, public _result: number) {
        this.n = _n;
        this.result = _result;
    }
}