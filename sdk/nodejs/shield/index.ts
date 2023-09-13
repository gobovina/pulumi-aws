// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export { DrtAccessLogBucketAssociationArgs, DrtAccessLogBucketAssociationState } from "./drtAccessLogBucketAssociation";
export type DrtAccessLogBucketAssociation = import("./drtAccessLogBucketAssociation").DrtAccessLogBucketAssociation;
export const DrtAccessLogBucketAssociation: typeof import("./drtAccessLogBucketAssociation").DrtAccessLogBucketAssociation = null as any;
utilities.lazyLoad(exports, ["DrtAccessLogBucketAssociation"], () => require("./drtAccessLogBucketAssociation"));

export { DrtAccessRoleArnAssociationArgs, DrtAccessRoleArnAssociationState } from "./drtAccessRoleArnAssociation";
export type DrtAccessRoleArnAssociation = import("./drtAccessRoleArnAssociation").DrtAccessRoleArnAssociation;
export const DrtAccessRoleArnAssociation: typeof import("./drtAccessRoleArnAssociation").DrtAccessRoleArnAssociation = null as any;
utilities.lazyLoad(exports, ["DrtAccessRoleArnAssociation"], () => require("./drtAccessRoleArnAssociation"));

export { ProtectionArgs, ProtectionState } from "./protection";
export type Protection = import("./protection").Protection;
export const Protection: typeof import("./protection").Protection = null as any;
utilities.lazyLoad(exports, ["Protection"], () => require("./protection"));

export { ProtectionGroupArgs, ProtectionGroupState } from "./protectionGroup";
export type ProtectionGroup = import("./protectionGroup").ProtectionGroup;
export const ProtectionGroup: typeof import("./protectionGroup").ProtectionGroup = null as any;
utilities.lazyLoad(exports, ["ProtectionGroup"], () => require("./protectionGroup"));

export { ProtectionHealthCheckAssociationArgs, ProtectionHealthCheckAssociationState } from "./protectionHealthCheckAssociation";
export type ProtectionHealthCheckAssociation = import("./protectionHealthCheckAssociation").ProtectionHealthCheckAssociation;
export const ProtectionHealthCheckAssociation: typeof import("./protectionHealthCheckAssociation").ProtectionHealthCheckAssociation = null as any;
utilities.lazyLoad(exports, ["ProtectionHealthCheckAssociation"], () => require("./protectionHealthCheckAssociation"));


const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "aws:shield/drtAccessLogBucketAssociation:DrtAccessLogBucketAssociation":
                return new DrtAccessLogBucketAssociation(name, <any>undefined, { urn })
            case "aws:shield/drtAccessRoleArnAssociation:DrtAccessRoleArnAssociation":
                return new DrtAccessRoleArnAssociation(name, <any>undefined, { urn })
            case "aws:shield/protection:Protection":
                return new Protection(name, <any>undefined, { urn })
            case "aws:shield/protectionGroup:ProtectionGroup":
                return new ProtectionGroup(name, <any>undefined, { urn })
            case "aws:shield/protectionHealthCheckAssociation:ProtectionHealthCheckAssociation":
                return new ProtectionHealthCheckAssociation(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("aws", "shield/drtAccessLogBucketAssociation", _module)
pulumi.runtime.registerResourceModule("aws", "shield/drtAccessRoleArnAssociation", _module)
pulumi.runtime.registerResourceModule("aws", "shield/protection", _module)
pulumi.runtime.registerResourceModule("aws", "shield/protectionGroup", _module)
pulumi.runtime.registerResourceModule("aws", "shield/protectionHealthCheckAssociation", _module)
