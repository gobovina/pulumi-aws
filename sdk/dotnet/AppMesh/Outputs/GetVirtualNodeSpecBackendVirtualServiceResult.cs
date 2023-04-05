// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.AppMesh.Outputs
{

    [OutputType]
    public sealed class GetVirtualNodeSpecBackendVirtualServiceResult
    {
        public readonly ImmutableArray<Outputs.GetVirtualNodeSpecBackendVirtualServiceClientPolicyResult> ClientPolicies;
        public readonly string VirtualServiceName;

        [OutputConstructor]
        private GetVirtualNodeSpecBackendVirtualServiceResult(
            ImmutableArray<Outputs.GetVirtualNodeSpecBackendVirtualServiceClientPolicyResult> clientPolicies,

            string virtualServiceName)
        {
            ClientPolicies = clientPolicies;
            VirtualServiceName = virtualServiceName;
        }
    }
}
