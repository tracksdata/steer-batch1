import { useState } from 'react';

const Buttongen = (props) => {

    const [btnHitCount, setBtnHitCount] = useState(0);
    function btnHittsCount() {
        setBtnHitCount(btnHitCount + 1);
        props.parentF1(props.btnLabel);
    }

    return (
        <div className="c1">
            <div className="card card-body">
                <span className="text-center"><h3>{btnHitCount}</h3></span>
                <hr />
                <button onClick={() => btnHittsCount()} className="btn btn-primary">{props.btnLabel}</button>
            </div>
        </div>

    );
};

export default Buttongen;