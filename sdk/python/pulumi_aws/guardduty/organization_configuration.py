# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['OrganizationConfigurationArgs', 'OrganizationConfiguration']

@pulumi.input_type
class OrganizationConfigurationArgs:
    def __init__(__self__, *,
                 auto_enable: pulumi.Input[bool],
                 detector_id: pulumi.Input[str]):
        """
        The set of arguments for constructing a OrganizationConfiguration resource.
        :param pulumi.Input[bool] auto_enable: When this setting is enabled, all new accounts that are created in, or added to, the organization are added as a member accounts of the organization’s GuardDuty delegated administrator and GuardDuty is enabled in that AWS Region.
        :param pulumi.Input[str] detector_id: The detector ID of the GuardDuty account.
        """
        pulumi.set(__self__, "auto_enable", auto_enable)
        pulumi.set(__self__, "detector_id", detector_id)

    @property
    @pulumi.getter(name="autoEnable")
    def auto_enable(self) -> pulumi.Input[bool]:
        """
        When this setting is enabled, all new accounts that are created in, or added to, the organization are added as a member accounts of the organization’s GuardDuty delegated administrator and GuardDuty is enabled in that AWS Region.
        """
        return pulumi.get(self, "auto_enable")

    @auto_enable.setter
    def auto_enable(self, value: pulumi.Input[bool]):
        pulumi.set(self, "auto_enable", value)

    @property
    @pulumi.getter(name="detectorId")
    def detector_id(self) -> pulumi.Input[str]:
        """
        The detector ID of the GuardDuty account.
        """
        return pulumi.get(self, "detector_id")

    @detector_id.setter
    def detector_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "detector_id", value)


@pulumi.input_type
class _OrganizationConfigurationState:
    def __init__(__self__, *,
                 auto_enable: Optional[pulumi.Input[bool]] = None,
                 detector_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering OrganizationConfiguration resources.
        :param pulumi.Input[bool] auto_enable: When this setting is enabled, all new accounts that are created in, or added to, the organization are added as a member accounts of the organization’s GuardDuty delegated administrator and GuardDuty is enabled in that AWS Region.
        :param pulumi.Input[str] detector_id: The detector ID of the GuardDuty account.
        """
        if auto_enable is not None:
            pulumi.set(__self__, "auto_enable", auto_enable)
        if detector_id is not None:
            pulumi.set(__self__, "detector_id", detector_id)

    @property
    @pulumi.getter(name="autoEnable")
    def auto_enable(self) -> Optional[pulumi.Input[bool]]:
        """
        When this setting is enabled, all new accounts that are created in, or added to, the organization are added as a member accounts of the organization’s GuardDuty delegated administrator and GuardDuty is enabled in that AWS Region.
        """
        return pulumi.get(self, "auto_enable")

    @auto_enable.setter
    def auto_enable(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "auto_enable", value)

    @property
    @pulumi.getter(name="detectorId")
    def detector_id(self) -> Optional[pulumi.Input[str]]:
        """
        The detector ID of the GuardDuty account.
        """
        return pulumi.get(self, "detector_id")

    @detector_id.setter
    def detector_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "detector_id", value)


class OrganizationConfiguration(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 auto_enable: Optional[pulumi.Input[bool]] = None,
                 detector_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Manages the GuardDuty Organization Configuration in the current AWS Region. The AWS account utilizing this resource must have been assigned as a delegated Organization administrator account, e.g. via the `guardduty.OrganizationAdminAccount` resource. More information about Organizations support in GuardDuty can be found in the [GuardDuty User Guide](https://docs.aws.amazon.com/guardduty/latest/ug/guardduty_organizations.html).

        > **NOTE:** This is an advanced resource. The provider will automatically assume management of the GuardDuty Organization Configuration without import and perform no actions on removal from the resource configuration.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example_detector = aws.guardduty.Detector("exampleDetector", enable=True)
        example_organization_configuration = aws.guardduty.OrganizationConfiguration("exampleOrganizationConfiguration",
            auto_enable=True,
            detector_id=example_detector.id)
        ```

        ## Import

        GuardDuty Organization Configurations can be imported using the GuardDuty Detector ID, e.g.

        ```sh
         $ pulumi import aws:guardduty/organizationConfiguration:OrganizationConfiguration example 00b00fd5aecc0ab60a708659477e9617
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] auto_enable: When this setting is enabled, all new accounts that are created in, or added to, the organization are added as a member accounts of the organization’s GuardDuty delegated administrator and GuardDuty is enabled in that AWS Region.
        :param pulumi.Input[str] detector_id: The detector ID of the GuardDuty account.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: OrganizationConfigurationArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages the GuardDuty Organization Configuration in the current AWS Region. The AWS account utilizing this resource must have been assigned as a delegated Organization administrator account, e.g. via the `guardduty.OrganizationAdminAccount` resource. More information about Organizations support in GuardDuty can be found in the [GuardDuty User Guide](https://docs.aws.amazon.com/guardduty/latest/ug/guardduty_organizations.html).

        > **NOTE:** This is an advanced resource. The provider will automatically assume management of the GuardDuty Organization Configuration without import and perform no actions on removal from the resource configuration.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example_detector = aws.guardduty.Detector("exampleDetector", enable=True)
        example_organization_configuration = aws.guardduty.OrganizationConfiguration("exampleOrganizationConfiguration",
            auto_enable=True,
            detector_id=example_detector.id)
        ```

        ## Import

        GuardDuty Organization Configurations can be imported using the GuardDuty Detector ID, e.g.

        ```sh
         $ pulumi import aws:guardduty/organizationConfiguration:OrganizationConfiguration example 00b00fd5aecc0ab60a708659477e9617
        ```

        :param str resource_name: The name of the resource.
        :param OrganizationConfigurationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(OrganizationConfigurationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 auto_enable: Optional[pulumi.Input[bool]] = None,
                 detector_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = OrganizationConfigurationArgs.__new__(OrganizationConfigurationArgs)

            if auto_enable is None and not opts.urn:
                raise TypeError("Missing required property 'auto_enable'")
            __props__.__dict__["auto_enable"] = auto_enable
            if detector_id is None and not opts.urn:
                raise TypeError("Missing required property 'detector_id'")
            __props__.__dict__["detector_id"] = detector_id
        super(OrganizationConfiguration, __self__).__init__(
            'aws:guardduty/organizationConfiguration:OrganizationConfiguration',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            auto_enable: Optional[pulumi.Input[bool]] = None,
            detector_id: Optional[pulumi.Input[str]] = None) -> 'OrganizationConfiguration':
        """
        Get an existing OrganizationConfiguration resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] auto_enable: When this setting is enabled, all new accounts that are created in, or added to, the organization are added as a member accounts of the organization’s GuardDuty delegated administrator and GuardDuty is enabled in that AWS Region.
        :param pulumi.Input[str] detector_id: The detector ID of the GuardDuty account.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _OrganizationConfigurationState.__new__(_OrganizationConfigurationState)

        __props__.__dict__["auto_enable"] = auto_enable
        __props__.__dict__["detector_id"] = detector_id
        return OrganizationConfiguration(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="autoEnable")
    def auto_enable(self) -> pulumi.Output[bool]:
        """
        When this setting is enabled, all new accounts that are created in, or added to, the organization are added as a member accounts of the organization’s GuardDuty delegated administrator and GuardDuty is enabled in that AWS Region.
        """
        return pulumi.get(self, "auto_enable")

    @property
    @pulumi.getter(name="detectorId")
    def detector_id(self) -> pulumi.Output[str]:
        """
        The detector ID of the GuardDuty account.
        """
        return pulumi.get(self, "detector_id")

