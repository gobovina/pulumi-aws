# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['DefaultPatchBaselineArgs', 'DefaultPatchBaseline']

@pulumi.input_type
class DefaultPatchBaselineArgs:
    def __init__(__self__, *,
                 baseline_id: pulumi.Input[str],
                 operating_system: pulumi.Input[str]):
        """
        The set of arguments for constructing a DefaultPatchBaseline resource.
        :param pulumi.Input[str] baseline_id: ID of the patch baseline.
               Can be an ID or an ARN.
               When specifying an AWS-provided patch baseline, must be the ARN.
        :param pulumi.Input[str] operating_system: The operating system the patch baseline applies to.
               Valid values are
               `AMAZON_LINUX`,
               `AMAZON_LINUX_2`,
               `AMAZON_LINUX_2022`,
               `CENTOS`,
               `DEBIAN`,
               `MACOS`,
               `ORACLE_LINUX`,
               `RASPBIAN`,
               `REDHAT_ENTERPRISE_LINUX`,
               `ROCKY_LINUX`,
               `SUSE`,
               `UBUNTU`, and
               `WINDOWS`.
        """
        pulumi.set(__self__, "baseline_id", baseline_id)
        pulumi.set(__self__, "operating_system", operating_system)

    @property
    @pulumi.getter(name="baselineId")
    def baseline_id(self) -> pulumi.Input[str]:
        """
        ID of the patch baseline.
        Can be an ID or an ARN.
        When specifying an AWS-provided patch baseline, must be the ARN.
        """
        return pulumi.get(self, "baseline_id")

    @baseline_id.setter
    def baseline_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "baseline_id", value)

    @property
    @pulumi.getter(name="operatingSystem")
    def operating_system(self) -> pulumi.Input[str]:
        """
        The operating system the patch baseline applies to.
        Valid values are
        `AMAZON_LINUX`,
        `AMAZON_LINUX_2`,
        `AMAZON_LINUX_2022`,
        `CENTOS`,
        `DEBIAN`,
        `MACOS`,
        `ORACLE_LINUX`,
        `RASPBIAN`,
        `REDHAT_ENTERPRISE_LINUX`,
        `ROCKY_LINUX`,
        `SUSE`,
        `UBUNTU`, and
        `WINDOWS`.
        """
        return pulumi.get(self, "operating_system")

    @operating_system.setter
    def operating_system(self, value: pulumi.Input[str]):
        pulumi.set(self, "operating_system", value)


@pulumi.input_type
class _DefaultPatchBaselineState:
    def __init__(__self__, *,
                 baseline_id: Optional[pulumi.Input[str]] = None,
                 operating_system: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering DefaultPatchBaseline resources.
        :param pulumi.Input[str] baseline_id: ID of the patch baseline.
               Can be an ID or an ARN.
               When specifying an AWS-provided patch baseline, must be the ARN.
        :param pulumi.Input[str] operating_system: The operating system the patch baseline applies to.
               Valid values are
               `AMAZON_LINUX`,
               `AMAZON_LINUX_2`,
               `AMAZON_LINUX_2022`,
               `CENTOS`,
               `DEBIAN`,
               `MACOS`,
               `ORACLE_LINUX`,
               `RASPBIAN`,
               `REDHAT_ENTERPRISE_LINUX`,
               `ROCKY_LINUX`,
               `SUSE`,
               `UBUNTU`, and
               `WINDOWS`.
        """
        if baseline_id is not None:
            pulumi.set(__self__, "baseline_id", baseline_id)
        if operating_system is not None:
            pulumi.set(__self__, "operating_system", operating_system)

    @property
    @pulumi.getter(name="baselineId")
    def baseline_id(self) -> Optional[pulumi.Input[str]]:
        """
        ID of the patch baseline.
        Can be an ID or an ARN.
        When specifying an AWS-provided patch baseline, must be the ARN.
        """
        return pulumi.get(self, "baseline_id")

    @baseline_id.setter
    def baseline_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "baseline_id", value)

    @property
    @pulumi.getter(name="operatingSystem")
    def operating_system(self) -> Optional[pulumi.Input[str]]:
        """
        The operating system the patch baseline applies to.
        Valid values are
        `AMAZON_LINUX`,
        `AMAZON_LINUX_2`,
        `AMAZON_LINUX_2022`,
        `CENTOS`,
        `DEBIAN`,
        `MACOS`,
        `ORACLE_LINUX`,
        `RASPBIAN`,
        `REDHAT_ENTERPRISE_LINUX`,
        `ROCKY_LINUX`,
        `SUSE`,
        `UBUNTU`, and
        `WINDOWS`.
        """
        return pulumi.get(self, "operating_system")

    @operating_system.setter
    def operating_system(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "operating_system", value)


class DefaultPatchBaseline(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 baseline_id: Optional[pulumi.Input[str]] = None,
                 operating_system: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Resource for registering an AWS Systems Manager Default Patch Baseline.

        ## Example Usage
        ### Basic Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example_patch_baseline = aws.ssm.PatchBaseline("example",
            name="example",
            approved_patches=["KB123456"])
        example = aws.ssm.DefaultPatchBaseline("example",
            baseline_id=example_patch_baseline.id,
            operating_system=example_patch_baseline.operating_system)
        ```

        ## Import

        Using the patch baseline ARN:

        Using the operating system value:

        __Using `pulumi import` to import__ the Systems Manager Default Patch Baseline using the patch baseline ID, patch baseline ARN, or the operating system value. For example:

        Using the patch baseline ID:

        ```sh
         $ pulumi import aws:ssm/defaultPatchBaseline:DefaultPatchBaseline example pb-1234567890abcdef1
        ```
         Using the patch baseline ARN:

        ```sh
         $ pulumi import aws:ssm/defaultPatchBaseline:DefaultPatchBaseline example arn:aws:ssm:us-west-2:123456789012:patchbaseline/pb-1234567890abcdef1
        ```
         Using the operating system value:

        ```sh
         $ pulumi import aws:ssm/defaultPatchBaseline:DefaultPatchBaseline example CENTOS
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] baseline_id: ID of the patch baseline.
               Can be an ID or an ARN.
               When specifying an AWS-provided patch baseline, must be the ARN.
        :param pulumi.Input[str] operating_system: The operating system the patch baseline applies to.
               Valid values are
               `AMAZON_LINUX`,
               `AMAZON_LINUX_2`,
               `AMAZON_LINUX_2022`,
               `CENTOS`,
               `DEBIAN`,
               `MACOS`,
               `ORACLE_LINUX`,
               `RASPBIAN`,
               `REDHAT_ENTERPRISE_LINUX`,
               `ROCKY_LINUX`,
               `SUSE`,
               `UBUNTU`, and
               `WINDOWS`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: DefaultPatchBaselineArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Resource for registering an AWS Systems Manager Default Patch Baseline.

        ## Example Usage
        ### Basic Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example_patch_baseline = aws.ssm.PatchBaseline("example",
            name="example",
            approved_patches=["KB123456"])
        example = aws.ssm.DefaultPatchBaseline("example",
            baseline_id=example_patch_baseline.id,
            operating_system=example_patch_baseline.operating_system)
        ```

        ## Import

        Using the patch baseline ARN:

        Using the operating system value:

        __Using `pulumi import` to import__ the Systems Manager Default Patch Baseline using the patch baseline ID, patch baseline ARN, or the operating system value. For example:

        Using the patch baseline ID:

        ```sh
         $ pulumi import aws:ssm/defaultPatchBaseline:DefaultPatchBaseline example pb-1234567890abcdef1
        ```
         Using the patch baseline ARN:

        ```sh
         $ pulumi import aws:ssm/defaultPatchBaseline:DefaultPatchBaseline example arn:aws:ssm:us-west-2:123456789012:patchbaseline/pb-1234567890abcdef1
        ```
         Using the operating system value:

        ```sh
         $ pulumi import aws:ssm/defaultPatchBaseline:DefaultPatchBaseline example CENTOS
        ```

        :param str resource_name: The name of the resource.
        :param DefaultPatchBaselineArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(DefaultPatchBaselineArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 baseline_id: Optional[pulumi.Input[str]] = None,
                 operating_system: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = DefaultPatchBaselineArgs.__new__(DefaultPatchBaselineArgs)

            if baseline_id is None and not opts.urn:
                raise TypeError("Missing required property 'baseline_id'")
            __props__.__dict__["baseline_id"] = baseline_id
            if operating_system is None and not opts.urn:
                raise TypeError("Missing required property 'operating_system'")
            __props__.__dict__["operating_system"] = operating_system
        super(DefaultPatchBaseline, __self__).__init__(
            'aws:ssm/defaultPatchBaseline:DefaultPatchBaseline',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            baseline_id: Optional[pulumi.Input[str]] = None,
            operating_system: Optional[pulumi.Input[str]] = None) -> 'DefaultPatchBaseline':
        """
        Get an existing DefaultPatchBaseline resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] baseline_id: ID of the patch baseline.
               Can be an ID or an ARN.
               When specifying an AWS-provided patch baseline, must be the ARN.
        :param pulumi.Input[str] operating_system: The operating system the patch baseline applies to.
               Valid values are
               `AMAZON_LINUX`,
               `AMAZON_LINUX_2`,
               `AMAZON_LINUX_2022`,
               `CENTOS`,
               `DEBIAN`,
               `MACOS`,
               `ORACLE_LINUX`,
               `RASPBIAN`,
               `REDHAT_ENTERPRISE_LINUX`,
               `ROCKY_LINUX`,
               `SUSE`,
               `UBUNTU`, and
               `WINDOWS`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _DefaultPatchBaselineState.__new__(_DefaultPatchBaselineState)

        __props__.__dict__["baseline_id"] = baseline_id
        __props__.__dict__["operating_system"] = operating_system
        return DefaultPatchBaseline(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="baselineId")
    def baseline_id(self) -> pulumi.Output[str]:
        """
        ID of the patch baseline.
        Can be an ID or an ARN.
        When specifying an AWS-provided patch baseline, must be the ARN.
        """
        return pulumi.get(self, "baseline_id")

    @property
    @pulumi.getter(name="operatingSystem")
    def operating_system(self) -> pulumi.Output[str]:
        """
        The operating system the patch baseline applies to.
        Valid values are
        `AMAZON_LINUX`,
        `AMAZON_LINUX_2`,
        `AMAZON_LINUX_2022`,
        `CENTOS`,
        `DEBIAN`,
        `MACOS`,
        `ORACLE_LINUX`,
        `RASPBIAN`,
        `REDHAT_ENTERPRISE_LINUX`,
        `ROCKY_LINUX`,
        `SUSE`,
        `UBUNTU`, and
        `WINDOWS`.
        """
        return pulumi.get(self, "operating_system")

