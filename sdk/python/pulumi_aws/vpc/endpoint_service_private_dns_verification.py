# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import sys
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
if sys.version_info >= (3, 11):
    from typing import NotRequired, TypedDict, TypeAlias
else:
    from typing_extensions import NotRequired, TypedDict, TypeAlias
from .. import _utilities
from . import outputs
from ._inputs import *

__all__ = ['EndpointServicePrivateDnsVerificationArgs', 'EndpointServicePrivateDnsVerification']

@pulumi.input_type
class EndpointServicePrivateDnsVerificationArgs:
    def __init__(__self__, *,
                 service_id: pulumi.Input[str],
                 timeouts: Optional[pulumi.Input['EndpointServicePrivateDnsVerificationTimeoutsArgs']] = None,
                 wait_for_verification: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a EndpointServicePrivateDnsVerification resource.
        :param pulumi.Input[str] service_id: ID of the endpoint service.
               
               The following arguments are optional:
        :param pulumi.Input[bool] wait_for_verification: Whether to wait until the endpoint service returns a `Verified` status for the configured private DNS name.
        """
        pulumi.set(__self__, "service_id", service_id)
        if timeouts is not None:
            pulumi.set(__self__, "timeouts", timeouts)
        if wait_for_verification is not None:
            pulumi.set(__self__, "wait_for_verification", wait_for_verification)

    @property
    @pulumi.getter(name="serviceId")
    def service_id(self) -> pulumi.Input[str]:
        """
        ID of the endpoint service.

        The following arguments are optional:
        """
        return pulumi.get(self, "service_id")

    @service_id.setter
    def service_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "service_id", value)

    @property
    @pulumi.getter
    def timeouts(self) -> Optional[pulumi.Input['EndpointServicePrivateDnsVerificationTimeoutsArgs']]:
        return pulumi.get(self, "timeouts")

    @timeouts.setter
    def timeouts(self, value: Optional[pulumi.Input['EndpointServicePrivateDnsVerificationTimeoutsArgs']]):
        pulumi.set(self, "timeouts", value)

    @property
    @pulumi.getter(name="waitForVerification")
    def wait_for_verification(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether to wait until the endpoint service returns a `Verified` status for the configured private DNS name.
        """
        return pulumi.get(self, "wait_for_verification")

    @wait_for_verification.setter
    def wait_for_verification(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "wait_for_verification", value)


@pulumi.input_type
class _EndpointServicePrivateDnsVerificationState:
    def __init__(__self__, *,
                 service_id: Optional[pulumi.Input[str]] = None,
                 timeouts: Optional[pulumi.Input['EndpointServicePrivateDnsVerificationTimeoutsArgs']] = None,
                 wait_for_verification: Optional[pulumi.Input[bool]] = None):
        """
        Input properties used for looking up and filtering EndpointServicePrivateDnsVerification resources.
        :param pulumi.Input[str] service_id: ID of the endpoint service.
               
               The following arguments are optional:
        :param pulumi.Input[bool] wait_for_verification: Whether to wait until the endpoint service returns a `Verified` status for the configured private DNS name.
        """
        if service_id is not None:
            pulumi.set(__self__, "service_id", service_id)
        if timeouts is not None:
            pulumi.set(__self__, "timeouts", timeouts)
        if wait_for_verification is not None:
            pulumi.set(__self__, "wait_for_verification", wait_for_verification)

    @property
    @pulumi.getter(name="serviceId")
    def service_id(self) -> Optional[pulumi.Input[str]]:
        """
        ID of the endpoint service.

        The following arguments are optional:
        """
        return pulumi.get(self, "service_id")

    @service_id.setter
    def service_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "service_id", value)

    @property
    @pulumi.getter
    def timeouts(self) -> Optional[pulumi.Input['EndpointServicePrivateDnsVerificationTimeoutsArgs']]:
        return pulumi.get(self, "timeouts")

    @timeouts.setter
    def timeouts(self, value: Optional[pulumi.Input['EndpointServicePrivateDnsVerificationTimeoutsArgs']]):
        pulumi.set(self, "timeouts", value)

    @property
    @pulumi.getter(name="waitForVerification")
    def wait_for_verification(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether to wait until the endpoint service returns a `Verified` status for the configured private DNS name.
        """
        return pulumi.get(self, "wait_for_verification")

    @wait_for_verification.setter
    def wait_for_verification(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "wait_for_verification", value)


class EndpointServicePrivateDnsVerification(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 service_id: Optional[pulumi.Input[str]] = None,
                 timeouts: Optional[pulumi.Input[Union['EndpointServicePrivateDnsVerificationTimeoutsArgs', 'EndpointServicePrivateDnsVerificationTimeoutsArgsDict']]] = None,
                 wait_for_verification: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        """
        Resource for managing an AWS VPC (Virtual Private Cloud) Endpoint Service Private DNS Verification.
        This resource begins the verification process by calling the [`StartVpcEndpointServicePrivateDnsVerification`](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_StartVpcEndpointServicePrivateDnsVerification.html) API.
        The service provider should add a record to the DNS server _before_ creating this resource.

        For additional details, refer to the AWS documentation on [managing VPC endpoint service DNS names](https://docs.aws.amazon.com/vpc/latest/privatelink/manage-dns-names.html).

        > Destruction of this resource will not stop the verification process, only remove the resource from state.

        ## Example Usage

        ### Basic Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.vpc.EndpointServicePrivateDnsVerification("example", service_id=example_aws_vpc_endpoint_service["id"])
        ```

        ## Import

        You cannot import this resource.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] service_id: ID of the endpoint service.
               
               The following arguments are optional:
        :param pulumi.Input[bool] wait_for_verification: Whether to wait until the endpoint service returns a `Verified` status for the configured private DNS name.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: EndpointServicePrivateDnsVerificationArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Resource for managing an AWS VPC (Virtual Private Cloud) Endpoint Service Private DNS Verification.
        This resource begins the verification process by calling the [`StartVpcEndpointServicePrivateDnsVerification`](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_StartVpcEndpointServicePrivateDnsVerification.html) API.
        The service provider should add a record to the DNS server _before_ creating this resource.

        For additional details, refer to the AWS documentation on [managing VPC endpoint service DNS names](https://docs.aws.amazon.com/vpc/latest/privatelink/manage-dns-names.html).

        > Destruction of this resource will not stop the verification process, only remove the resource from state.

        ## Example Usage

        ### Basic Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.vpc.EndpointServicePrivateDnsVerification("example", service_id=example_aws_vpc_endpoint_service["id"])
        ```

        ## Import

        You cannot import this resource.

        :param str resource_name: The name of the resource.
        :param EndpointServicePrivateDnsVerificationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(EndpointServicePrivateDnsVerificationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 service_id: Optional[pulumi.Input[str]] = None,
                 timeouts: Optional[pulumi.Input[Union['EndpointServicePrivateDnsVerificationTimeoutsArgs', 'EndpointServicePrivateDnsVerificationTimeoutsArgsDict']]] = None,
                 wait_for_verification: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = EndpointServicePrivateDnsVerificationArgs.__new__(EndpointServicePrivateDnsVerificationArgs)

            if service_id is None and not opts.urn:
                raise TypeError("Missing required property 'service_id'")
            __props__.__dict__["service_id"] = service_id
            __props__.__dict__["timeouts"] = timeouts
            __props__.__dict__["wait_for_verification"] = wait_for_verification
        super(EndpointServicePrivateDnsVerification, __self__).__init__(
            'aws:vpc/endpointServicePrivateDnsVerification:EndpointServicePrivateDnsVerification',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            service_id: Optional[pulumi.Input[str]] = None,
            timeouts: Optional[pulumi.Input[Union['EndpointServicePrivateDnsVerificationTimeoutsArgs', 'EndpointServicePrivateDnsVerificationTimeoutsArgsDict']]] = None,
            wait_for_verification: Optional[pulumi.Input[bool]] = None) -> 'EndpointServicePrivateDnsVerification':
        """
        Get an existing EndpointServicePrivateDnsVerification resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] service_id: ID of the endpoint service.
               
               The following arguments are optional:
        :param pulumi.Input[bool] wait_for_verification: Whether to wait until the endpoint service returns a `Verified` status for the configured private DNS name.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _EndpointServicePrivateDnsVerificationState.__new__(_EndpointServicePrivateDnsVerificationState)

        __props__.__dict__["service_id"] = service_id
        __props__.__dict__["timeouts"] = timeouts
        __props__.__dict__["wait_for_verification"] = wait_for_verification
        return EndpointServicePrivateDnsVerification(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="serviceId")
    def service_id(self) -> pulumi.Output[str]:
        """
        ID of the endpoint service.

        The following arguments are optional:
        """
        return pulumi.get(self, "service_id")

    @property
    @pulumi.getter
    def timeouts(self) -> pulumi.Output[Optional['outputs.EndpointServicePrivateDnsVerificationTimeouts']]:
        return pulumi.get(self, "timeouts")

    @property
    @pulumi.getter(name="waitForVerification")
    def wait_for_verification(self) -> pulumi.Output[Optional[bool]]:
        """
        Whether to wait until the endpoint service returns a `Verified` status for the configured private DNS name.
        """
        return pulumi.get(self, "wait_for_verification")

