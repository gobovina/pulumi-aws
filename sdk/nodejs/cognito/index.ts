// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export * from "./getUserPoolClient";
export * from "./getUserPoolClients";
export * from "./getUserPoolSigningCertificate";
export * from "./getUserPools";
export * from "./identityPool";
export * from "./identityPoolProviderPrincipalTag";
export * from "./identityPoolRoleAttachment";
export * from "./identityProvider";
export * from "./resourceServer";
export * from "./userGroup";
export * from "./userPool";
export * from "./userPoolClient";
export * from "./userPoolDomain";
export * from "./userPoolUICustomization";

// Import resources to register:
import { IdentityPool } from "./identityPool";
import { IdentityPoolProviderPrincipalTag } from "./identityPoolProviderPrincipalTag";
import { IdentityPoolRoleAttachment } from "./identityPoolRoleAttachment";
import { IdentityProvider } from "./identityProvider";
import { ResourceServer } from "./resourceServer";
import { UserGroup } from "./userGroup";
import { UserPool } from "./userPool";
import { UserPoolClient } from "./userPoolClient";
import { UserPoolDomain } from "./userPoolDomain";
import { UserPoolUICustomization } from "./userPoolUICustomization";

const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "aws:cognito/identityPool:IdentityPool":
                return new IdentityPool(name, <any>undefined, { urn })
            case "aws:cognito/identityPoolProviderPrincipalTag:IdentityPoolProviderPrincipalTag":
                return new IdentityPoolProviderPrincipalTag(name, <any>undefined, { urn })
            case "aws:cognito/identityPoolRoleAttachment:IdentityPoolRoleAttachment":
                return new IdentityPoolRoleAttachment(name, <any>undefined, { urn })
            case "aws:cognito/identityProvider:IdentityProvider":
                return new IdentityProvider(name, <any>undefined, { urn })
            case "aws:cognito/resourceServer:ResourceServer":
                return new ResourceServer(name, <any>undefined, { urn })
            case "aws:cognito/userGroup:UserGroup":
                return new UserGroup(name, <any>undefined, { urn })
            case "aws:cognito/userPool:UserPool":
                return new UserPool(name, <any>undefined, { urn })
            case "aws:cognito/userPoolClient:UserPoolClient":
                return new UserPoolClient(name, <any>undefined, { urn })
            case "aws:cognito/userPoolDomain:UserPoolDomain":
                return new UserPoolDomain(name, <any>undefined, { urn })
            case "aws:cognito/userPoolUICustomization:UserPoolUICustomization":
                return new UserPoolUICustomization(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("aws", "cognito/identityPool", _module)
pulumi.runtime.registerResourceModule("aws", "cognito/identityPoolProviderPrincipalTag", _module)
pulumi.runtime.registerResourceModule("aws", "cognito/identityPoolRoleAttachment", _module)
pulumi.runtime.registerResourceModule("aws", "cognito/identityProvider", _module)
pulumi.runtime.registerResourceModule("aws", "cognito/resourceServer", _module)
pulumi.runtime.registerResourceModule("aws", "cognito/userGroup", _module)
pulumi.runtime.registerResourceModule("aws", "cognito/userPool", _module)
pulumi.runtime.registerResourceModule("aws", "cognito/userPoolClient", _module)
pulumi.runtime.registerResourceModule("aws", "cognito/userPoolDomain", _module)
pulumi.runtime.registerResourceModule("aws", "cognito/userPoolUICustomization", _module)
