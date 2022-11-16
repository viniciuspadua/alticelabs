import { NumberOutput } from "./NumberOutput";

export class AlticciOutput {
    
    current: NumberOutput;
    previous: NumberOutput[];

    constructor(private _current: NumberOutput, public _previous: NumberOutput[]) {
        this.current = _current;
        this.previous = _previous;
    }
}