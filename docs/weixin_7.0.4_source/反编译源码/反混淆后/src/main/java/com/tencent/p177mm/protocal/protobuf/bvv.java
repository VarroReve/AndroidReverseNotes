package com.tencent.p177mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.p205bt.C1331a;
import java.util.LinkedList;
import p690e.p691a.p692a.C6087a;
import p690e.p691a.p692a.C6092b;
import p690e.p691a.p692a.p693a.C6086a;
import p690e.p691a.p692a.p695b.p697b.C6091a;
import p690e.p691a.p692a.p698c.C6093a;

/* renamed from: com.tencent.mm.protocal.protobuf.bvv */
public final class bvv extends C1331a {
    public C7287xu vHF;
    public SKBuiltinBuffer_t vHG;
    public SKBuiltinBuffer_t vHH;
    public int vHV;
    public SKBuiltinBuffer_t vHY;
    public SKBuiltinBuffer_t vHZ;

    /* renamed from: op */
    public final int mo4669op(int i, Object... objArr) {
        AppMethodBeat.m2504i(58930);
        C6092b c6092b;
        int ix;
        if (i == 0) {
            C6093a c6093a = (C6093a) objArr[0];
            if (this.vHH == null) {
                c6092b = new C6092b("Not all required fields were included: AutoAuthKey");
                AppMethodBeat.m2505o(58930);
                throw c6092b;
            } else if (this.vHF == null) {
                c6092b = new C6092b("Not all required fields were included: SvrPubECDHKey");
                AppMethodBeat.m2505o(58930);
                throw c6092b;
            } else if (this.vHG == null) {
                c6092b = new C6092b("Not all required fields were included: SessionKey");
                AppMethodBeat.m2505o(58930);
                throw c6092b;
            } else {
                if (this.vHH != null) {
                    c6093a.mo13479iy(1, this.vHH.computeSize());
                    this.vHH.writeFields(c6093a);
                }
                if (this.vHF != null) {
                    c6093a.mo13479iy(2, this.vHF.computeSize());
                    this.vHF.writeFields(c6093a);
                }
                if (this.vHG != null) {
                    c6093a.mo13479iy(3, this.vHG.computeSize());
                    this.vHG.writeFields(c6093a);
                }
                c6093a.mo13480iz(4, this.vHV);
                if (this.vHY != null) {
                    c6093a.mo13479iy(5, this.vHY.computeSize());
                    this.vHY.writeFields(c6093a);
                }
                if (this.vHZ != null) {
                    c6093a.mo13479iy(6, this.vHZ.computeSize());
                    this.vHZ.writeFields(c6093a);
                }
                AppMethodBeat.m2505o(58930);
                return 0;
            }
        } else if (i == 1) {
            if (this.vHH != null) {
                ix = C6087a.m9557ix(1, this.vHH.computeSize()) + 0;
            } else {
                ix = 0;
            }
            if (this.vHF != null) {
                ix += C6087a.m9557ix(2, this.vHF.computeSize());
            }
            if (this.vHG != null) {
                ix += C6087a.m9557ix(3, this.vHG.computeSize());
            }
            ix += C6091a.m9572bs(4, this.vHV);
            if (this.vHY != null) {
                ix += C6087a.m9557ix(5, this.vHY.computeSize());
            }
            if (this.vHZ != null) {
                ix += C6087a.m9557ix(6, this.vHZ.computeSize());
            }
            AppMethodBeat.m2505o(58930);
            return ix;
        } else if (i == 2) {
            C6086a c6086a = new C6086a((byte[]) objArr[0], unknownTagHandler);
            for (ix = C1331a.getNextFieldNumber(c6086a); ix > 0; ix = C1331a.getNextFieldNumber(c6086a)) {
                if (!super.populateBuilderWithField(c6086a, this, ix)) {
                    c6086a.ems();
                }
            }
            if (this.vHH == null) {
                c6092b = new C6092b("Not all required fields were included: AutoAuthKey");
                AppMethodBeat.m2505o(58930);
                throw c6092b;
            } else if (this.vHF == null) {
                c6092b = new C6092b("Not all required fields were included: SvrPubECDHKey");
                AppMethodBeat.m2505o(58930);
                throw c6092b;
            } else if (this.vHG == null) {
                c6092b = new C6092b("Not all required fields were included: SessionKey");
                AppMethodBeat.m2505o(58930);
                throw c6092b;
            } else {
                AppMethodBeat.m2505o(58930);
                return 0;
            }
        } else if (i == 3) {
            C6086a c6086a2 = (C6086a) objArr[0];
            bvv bvv = (bvv) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            LinkedList Vh;
            int size;
            byte[] bArr;
            SKBuiltinBuffer_t sKBuiltinBuffer_t;
            C6086a c6086a3;
            boolean z;
            switch (intValue) {
                case 1:
                    Vh = c6086a2.mo13445Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        sKBuiltinBuffer_t = new SKBuiltinBuffer_t();
                        c6086a3 = new C6086a(bArr, unknownTagHandler);
                        for (z = true; z; z = sKBuiltinBuffer_t.populateBuilderWithField(c6086a3, sKBuiltinBuffer_t, C1331a.getNextFieldNumber(c6086a3))) {
                        }
                        bvv.vHH = sKBuiltinBuffer_t;
                    }
                    AppMethodBeat.m2505o(58930);
                    return 0;
                case 2:
                    Vh = c6086a2.mo13445Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        C7287xu c7287xu = new C7287xu();
                        c6086a3 = new C6086a(bArr, unknownTagHandler);
                        for (z = true; z; z = c7287xu.populateBuilderWithField(c6086a3, c7287xu, C1331a.getNextFieldNumber(c6086a3))) {
                        }
                        bvv.vHF = c7287xu;
                    }
                    AppMethodBeat.m2505o(58930);
                    return 0;
                case 3:
                    Vh = c6086a2.mo13445Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        sKBuiltinBuffer_t = new SKBuiltinBuffer_t();
                        c6086a3 = new C6086a(bArr, unknownTagHandler);
                        for (z = true; z; z = sKBuiltinBuffer_t.populateBuilderWithField(c6086a3, sKBuiltinBuffer_t, C1331a.getNextFieldNumber(c6086a3))) {
                        }
                        bvv.vHG = sKBuiltinBuffer_t;
                    }
                    AppMethodBeat.m2505o(58930);
                    return 0;
                case 4:
                    bvv.vHV = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(58930);
                    return 0;
                case 5:
                    Vh = c6086a2.mo13445Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        sKBuiltinBuffer_t = new SKBuiltinBuffer_t();
                        c6086a3 = new C6086a(bArr, unknownTagHandler);
                        for (z = true; z; z = sKBuiltinBuffer_t.populateBuilderWithField(c6086a3, sKBuiltinBuffer_t, C1331a.getNextFieldNumber(c6086a3))) {
                        }
                        bvv.vHY = sKBuiltinBuffer_t;
                    }
                    AppMethodBeat.m2505o(58930);
                    return 0;
                case 6:
                    Vh = c6086a2.mo13445Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        sKBuiltinBuffer_t = new SKBuiltinBuffer_t();
                        c6086a3 = new C6086a(bArr, unknownTagHandler);
                        for (z = true; z; z = sKBuiltinBuffer_t.populateBuilderWithField(c6086a3, sKBuiltinBuffer_t, C1331a.getNextFieldNumber(c6086a3))) {
                        }
                        bvv.vHZ = sKBuiltinBuffer_t;
                    }
                    AppMethodBeat.m2505o(58930);
                    return 0;
                default:
                    AppMethodBeat.m2505o(58930);
                    return -1;
            }
        } else {
            AppMethodBeat.m2505o(58930);
            return -1;
        }
    }
}
