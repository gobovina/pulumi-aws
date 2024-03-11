# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['InstanceArgs', 'Instance']

@pulumi.input_type
class InstanceArgs:
    def __init__(__self__, *,
                 identity_management_type: pulumi.Input[str],
                 inbound_calls_enabled: pulumi.Input[bool],
                 outbound_calls_enabled: pulumi.Input[bool],
                 auto_resolve_best_voices_enabled: Optional[pulumi.Input[bool]] = None,
                 contact_flow_logs_enabled: Optional[pulumi.Input[bool]] = None,
                 contact_lens_enabled: Optional[pulumi.Input[bool]] = None,
                 directory_id: Optional[pulumi.Input[str]] = None,
                 early_media_enabled: Optional[pulumi.Input[bool]] = None,
                 instance_alias: Optional[pulumi.Input[str]] = None,
                 multi_party_conference_enabled: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a Instance resource.
        :param pulumi.Input[str] identity_management_type: Specifies the identity management type attached to the instance. Allowed Values are: `SAML`, `CONNECT_MANAGED`, `EXISTING_DIRECTORY`.
        :param pulumi.Input[bool] inbound_calls_enabled: Specifies whether inbound calls are enabled.
        :param pulumi.Input[bool] outbound_calls_enabled: Specifies whether outbound calls are enabled.
               <!-- * `use_custom_tts_voices` - (Optional) Whether use custom tts voices is enabled. Defaults to `false` -->
        :param pulumi.Input[bool] auto_resolve_best_voices_enabled: Specifies whether auto resolve best voices is enabled. Defaults to `true`.
        :param pulumi.Input[bool] contact_flow_logs_enabled: Specifies whether contact flow logs are enabled. Defaults to `false`.
        :param pulumi.Input[bool] contact_lens_enabled: Specifies whether contact lens is enabled. Defaults to `true`.
        :param pulumi.Input[str] directory_id: The identifier for the directory if identity_management_type is `EXISTING_DIRECTORY`.
        :param pulumi.Input[bool] early_media_enabled: Specifies whether early media for outbound calls is enabled . Defaults to `true` if outbound calls is enabled.
        :param pulumi.Input[str] instance_alias: Specifies the name of the instance. Required if `directory_id` not specified.
        :param pulumi.Input[bool] multi_party_conference_enabled: Specifies whether multi-party calls/conference is enabled. Defaults to `false`.
        """
        pulumi.set(__self__, "identity_management_type", identity_management_type)
        pulumi.set(__self__, "inbound_calls_enabled", inbound_calls_enabled)
        pulumi.set(__self__, "outbound_calls_enabled", outbound_calls_enabled)
        if auto_resolve_best_voices_enabled is not None:
            pulumi.set(__self__, "auto_resolve_best_voices_enabled", auto_resolve_best_voices_enabled)
        if contact_flow_logs_enabled is not None:
            pulumi.set(__self__, "contact_flow_logs_enabled", contact_flow_logs_enabled)
        if contact_lens_enabled is not None:
            pulumi.set(__self__, "contact_lens_enabled", contact_lens_enabled)
        if directory_id is not None:
            pulumi.set(__self__, "directory_id", directory_id)
        if early_media_enabled is not None:
            pulumi.set(__self__, "early_media_enabled", early_media_enabled)
        if instance_alias is not None:
            pulumi.set(__self__, "instance_alias", instance_alias)
        if multi_party_conference_enabled is not None:
            pulumi.set(__self__, "multi_party_conference_enabled", multi_party_conference_enabled)

    @property
    @pulumi.getter(name="identityManagementType")
    def identity_management_type(self) -> pulumi.Input[str]:
        """
        Specifies the identity management type attached to the instance. Allowed Values are: `SAML`, `CONNECT_MANAGED`, `EXISTING_DIRECTORY`.
        """
        return pulumi.get(self, "identity_management_type")

    @identity_management_type.setter
    def identity_management_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "identity_management_type", value)

    @property
    @pulumi.getter(name="inboundCallsEnabled")
    def inbound_calls_enabled(self) -> pulumi.Input[bool]:
        """
        Specifies whether inbound calls are enabled.
        """
        return pulumi.get(self, "inbound_calls_enabled")

    @inbound_calls_enabled.setter
    def inbound_calls_enabled(self, value: pulumi.Input[bool]):
        pulumi.set(self, "inbound_calls_enabled", value)

    @property
    @pulumi.getter(name="outboundCallsEnabled")
    def outbound_calls_enabled(self) -> pulumi.Input[bool]:
        """
        Specifies whether outbound calls are enabled.
        <!-- * `use_custom_tts_voices` - (Optional) Whether use custom tts voices is enabled. Defaults to `false` -->
        """
        return pulumi.get(self, "outbound_calls_enabled")

    @outbound_calls_enabled.setter
    def outbound_calls_enabled(self, value: pulumi.Input[bool]):
        pulumi.set(self, "outbound_calls_enabled", value)

    @property
    @pulumi.getter(name="autoResolveBestVoicesEnabled")
    def auto_resolve_best_voices_enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies whether auto resolve best voices is enabled. Defaults to `true`.
        """
        return pulumi.get(self, "auto_resolve_best_voices_enabled")

    @auto_resolve_best_voices_enabled.setter
    def auto_resolve_best_voices_enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "auto_resolve_best_voices_enabled", value)

    @property
    @pulumi.getter(name="contactFlowLogsEnabled")
    def contact_flow_logs_enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies whether contact flow logs are enabled. Defaults to `false`.
        """
        return pulumi.get(self, "contact_flow_logs_enabled")

    @contact_flow_logs_enabled.setter
    def contact_flow_logs_enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "contact_flow_logs_enabled", value)

    @property
    @pulumi.getter(name="contactLensEnabled")
    def contact_lens_enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies whether contact lens is enabled. Defaults to `true`.
        """
        return pulumi.get(self, "contact_lens_enabled")

    @contact_lens_enabled.setter
    def contact_lens_enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "contact_lens_enabled", value)

    @property
    @pulumi.getter(name="directoryId")
    def directory_id(self) -> Optional[pulumi.Input[str]]:
        """
        The identifier for the directory if identity_management_type is `EXISTING_DIRECTORY`.
        """
        return pulumi.get(self, "directory_id")

    @directory_id.setter
    def directory_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "directory_id", value)

    @property
    @pulumi.getter(name="earlyMediaEnabled")
    def early_media_enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies whether early media for outbound calls is enabled . Defaults to `true` if outbound calls is enabled.
        """
        return pulumi.get(self, "early_media_enabled")

    @early_media_enabled.setter
    def early_media_enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "early_media_enabled", value)

    @property
    @pulumi.getter(name="instanceAlias")
    def instance_alias(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the name of the instance. Required if `directory_id` not specified.
        """
        return pulumi.get(self, "instance_alias")

    @instance_alias.setter
    def instance_alias(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "instance_alias", value)

    @property
    @pulumi.getter(name="multiPartyConferenceEnabled")
    def multi_party_conference_enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies whether multi-party calls/conference is enabled. Defaults to `false`.
        """
        return pulumi.get(self, "multi_party_conference_enabled")

    @multi_party_conference_enabled.setter
    def multi_party_conference_enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "multi_party_conference_enabled", value)


@pulumi.input_type
class _InstanceState:
    def __init__(__self__, *,
                 arn: Optional[pulumi.Input[str]] = None,
                 auto_resolve_best_voices_enabled: Optional[pulumi.Input[bool]] = None,
                 contact_flow_logs_enabled: Optional[pulumi.Input[bool]] = None,
                 contact_lens_enabled: Optional[pulumi.Input[bool]] = None,
                 created_time: Optional[pulumi.Input[str]] = None,
                 directory_id: Optional[pulumi.Input[str]] = None,
                 early_media_enabled: Optional[pulumi.Input[bool]] = None,
                 identity_management_type: Optional[pulumi.Input[str]] = None,
                 inbound_calls_enabled: Optional[pulumi.Input[bool]] = None,
                 instance_alias: Optional[pulumi.Input[str]] = None,
                 multi_party_conference_enabled: Optional[pulumi.Input[bool]] = None,
                 outbound_calls_enabled: Optional[pulumi.Input[bool]] = None,
                 service_role: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Instance resources.
        :param pulumi.Input[str] arn: Amazon Resource Name (ARN) of the instance.
        :param pulumi.Input[bool] auto_resolve_best_voices_enabled: Specifies whether auto resolve best voices is enabled. Defaults to `true`.
        :param pulumi.Input[bool] contact_flow_logs_enabled: Specifies whether contact flow logs are enabled. Defaults to `false`.
        :param pulumi.Input[bool] contact_lens_enabled: Specifies whether contact lens is enabled. Defaults to `true`.
        :param pulumi.Input[str] created_time: When the instance was created.
        :param pulumi.Input[str] directory_id: The identifier for the directory if identity_management_type is `EXISTING_DIRECTORY`.
        :param pulumi.Input[bool] early_media_enabled: Specifies whether early media for outbound calls is enabled . Defaults to `true` if outbound calls is enabled.
        :param pulumi.Input[str] identity_management_type: Specifies the identity management type attached to the instance. Allowed Values are: `SAML`, `CONNECT_MANAGED`, `EXISTING_DIRECTORY`.
        :param pulumi.Input[bool] inbound_calls_enabled: Specifies whether inbound calls are enabled.
        :param pulumi.Input[str] instance_alias: Specifies the name of the instance. Required if `directory_id` not specified.
        :param pulumi.Input[bool] multi_party_conference_enabled: Specifies whether multi-party calls/conference is enabled. Defaults to `false`.
        :param pulumi.Input[bool] outbound_calls_enabled: Specifies whether outbound calls are enabled.
               <!-- * `use_custom_tts_voices` - (Optional) Whether use custom tts voices is enabled. Defaults to `false` -->
        :param pulumi.Input[str] service_role: The service role of the instance.
        :param pulumi.Input[str] status: The state of the instance.
        """
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if auto_resolve_best_voices_enabled is not None:
            pulumi.set(__self__, "auto_resolve_best_voices_enabled", auto_resolve_best_voices_enabled)
        if contact_flow_logs_enabled is not None:
            pulumi.set(__self__, "contact_flow_logs_enabled", contact_flow_logs_enabled)
        if contact_lens_enabled is not None:
            pulumi.set(__self__, "contact_lens_enabled", contact_lens_enabled)
        if created_time is not None:
            pulumi.set(__self__, "created_time", created_time)
        if directory_id is not None:
            pulumi.set(__self__, "directory_id", directory_id)
        if early_media_enabled is not None:
            pulumi.set(__self__, "early_media_enabled", early_media_enabled)
        if identity_management_type is not None:
            pulumi.set(__self__, "identity_management_type", identity_management_type)
        if inbound_calls_enabled is not None:
            pulumi.set(__self__, "inbound_calls_enabled", inbound_calls_enabled)
        if instance_alias is not None:
            pulumi.set(__self__, "instance_alias", instance_alias)
        if multi_party_conference_enabled is not None:
            pulumi.set(__self__, "multi_party_conference_enabled", multi_party_conference_enabled)
        if outbound_calls_enabled is not None:
            pulumi.set(__self__, "outbound_calls_enabled", outbound_calls_enabled)
        if service_role is not None:
            pulumi.set(__self__, "service_role", service_role)
        if status is not None:
            pulumi.set(__self__, "status", status)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        Amazon Resource Name (ARN) of the instance.
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter(name="autoResolveBestVoicesEnabled")
    def auto_resolve_best_voices_enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies whether auto resolve best voices is enabled. Defaults to `true`.
        """
        return pulumi.get(self, "auto_resolve_best_voices_enabled")

    @auto_resolve_best_voices_enabled.setter
    def auto_resolve_best_voices_enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "auto_resolve_best_voices_enabled", value)

    @property
    @pulumi.getter(name="contactFlowLogsEnabled")
    def contact_flow_logs_enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies whether contact flow logs are enabled. Defaults to `false`.
        """
        return pulumi.get(self, "contact_flow_logs_enabled")

    @contact_flow_logs_enabled.setter
    def contact_flow_logs_enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "contact_flow_logs_enabled", value)

    @property
    @pulumi.getter(name="contactLensEnabled")
    def contact_lens_enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies whether contact lens is enabled. Defaults to `true`.
        """
        return pulumi.get(self, "contact_lens_enabled")

    @contact_lens_enabled.setter
    def contact_lens_enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "contact_lens_enabled", value)

    @property
    @pulumi.getter(name="createdTime")
    def created_time(self) -> Optional[pulumi.Input[str]]:
        """
        When the instance was created.
        """
        return pulumi.get(self, "created_time")

    @created_time.setter
    def created_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "created_time", value)

    @property
    @pulumi.getter(name="directoryId")
    def directory_id(self) -> Optional[pulumi.Input[str]]:
        """
        The identifier for the directory if identity_management_type is `EXISTING_DIRECTORY`.
        """
        return pulumi.get(self, "directory_id")

    @directory_id.setter
    def directory_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "directory_id", value)

    @property
    @pulumi.getter(name="earlyMediaEnabled")
    def early_media_enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies whether early media for outbound calls is enabled . Defaults to `true` if outbound calls is enabled.
        """
        return pulumi.get(self, "early_media_enabled")

    @early_media_enabled.setter
    def early_media_enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "early_media_enabled", value)

    @property
    @pulumi.getter(name="identityManagementType")
    def identity_management_type(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the identity management type attached to the instance. Allowed Values are: `SAML`, `CONNECT_MANAGED`, `EXISTING_DIRECTORY`.
        """
        return pulumi.get(self, "identity_management_type")

    @identity_management_type.setter
    def identity_management_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "identity_management_type", value)

    @property
    @pulumi.getter(name="inboundCallsEnabled")
    def inbound_calls_enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies whether inbound calls are enabled.
        """
        return pulumi.get(self, "inbound_calls_enabled")

    @inbound_calls_enabled.setter
    def inbound_calls_enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "inbound_calls_enabled", value)

    @property
    @pulumi.getter(name="instanceAlias")
    def instance_alias(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the name of the instance. Required if `directory_id` not specified.
        """
        return pulumi.get(self, "instance_alias")

    @instance_alias.setter
    def instance_alias(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "instance_alias", value)

    @property
    @pulumi.getter(name="multiPartyConferenceEnabled")
    def multi_party_conference_enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies whether multi-party calls/conference is enabled. Defaults to `false`.
        """
        return pulumi.get(self, "multi_party_conference_enabled")

    @multi_party_conference_enabled.setter
    def multi_party_conference_enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "multi_party_conference_enabled", value)

    @property
    @pulumi.getter(name="outboundCallsEnabled")
    def outbound_calls_enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Specifies whether outbound calls are enabled.
        <!-- * `use_custom_tts_voices` - (Optional) Whether use custom tts voices is enabled. Defaults to `false` -->
        """
        return pulumi.get(self, "outbound_calls_enabled")

    @outbound_calls_enabled.setter
    def outbound_calls_enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "outbound_calls_enabled", value)

    @property
    @pulumi.getter(name="serviceRole")
    def service_role(self) -> Optional[pulumi.Input[str]]:
        """
        The service role of the instance.
        """
        return pulumi.get(self, "service_role")

    @service_role.setter
    def service_role(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "service_role", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        The state of the instance.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)


class Instance(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 auto_resolve_best_voices_enabled: Optional[pulumi.Input[bool]] = None,
                 contact_flow_logs_enabled: Optional[pulumi.Input[bool]] = None,
                 contact_lens_enabled: Optional[pulumi.Input[bool]] = None,
                 directory_id: Optional[pulumi.Input[str]] = None,
                 early_media_enabled: Optional[pulumi.Input[bool]] = None,
                 identity_management_type: Optional[pulumi.Input[str]] = None,
                 inbound_calls_enabled: Optional[pulumi.Input[bool]] = None,
                 instance_alias: Optional[pulumi.Input[str]] = None,
                 multi_party_conference_enabled: Optional[pulumi.Input[bool]] = None,
                 outbound_calls_enabled: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        """
        Provides an Amazon Connect instance resource. For more information see
        [Amazon Connect: Getting Started](https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-get-started.html)

        !> **WARN:** Amazon Connect enforces a limit of [100 combined instance creation and deletions every 30 days](https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html#feature-limits).  For example, if you create 80 instances and delete 20 of them, you must wait 30 days to create or delete another instance.  Use care when creating or deleting instances.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        test = aws.connect.Instance("test",
            identity_management_type="CONNECT_MANAGED",
            inbound_calls_enabled=True,
            instance_alias="friendly-name-connect",
            outbound_calls_enabled=True)
        ```
        <!--End PulumiCodeChooser -->

        ### With Existing Active Directory

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        test = aws.connect.Instance("test",
            directory_id=test_aws_directory_service_directory["id"],
            identity_management_type="EXISTING_DIRECTORY",
            inbound_calls_enabled=True,
            instance_alias="friendly-name-connect",
            outbound_calls_enabled=True)
        ```
        <!--End PulumiCodeChooser -->

        ### With SAML

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        test = aws.connect.Instance("test",
            identity_management_type="SAML",
            inbound_calls_enabled=True,
            instance_alias="friendly-name-connect",
            outbound_calls_enabled=True)
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Using `pulumi import`, import Connect instances using the `id`. For example:

        ```sh
        $ pulumi import aws:connect/instance:Instance example f1288a1f-6193-445a-b47e-af739b2
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] auto_resolve_best_voices_enabled: Specifies whether auto resolve best voices is enabled. Defaults to `true`.
        :param pulumi.Input[bool] contact_flow_logs_enabled: Specifies whether contact flow logs are enabled. Defaults to `false`.
        :param pulumi.Input[bool] contact_lens_enabled: Specifies whether contact lens is enabled. Defaults to `true`.
        :param pulumi.Input[str] directory_id: The identifier for the directory if identity_management_type is `EXISTING_DIRECTORY`.
        :param pulumi.Input[bool] early_media_enabled: Specifies whether early media for outbound calls is enabled . Defaults to `true` if outbound calls is enabled.
        :param pulumi.Input[str] identity_management_type: Specifies the identity management type attached to the instance. Allowed Values are: `SAML`, `CONNECT_MANAGED`, `EXISTING_DIRECTORY`.
        :param pulumi.Input[bool] inbound_calls_enabled: Specifies whether inbound calls are enabled.
        :param pulumi.Input[str] instance_alias: Specifies the name of the instance. Required if `directory_id` not specified.
        :param pulumi.Input[bool] multi_party_conference_enabled: Specifies whether multi-party calls/conference is enabled. Defaults to `false`.
        :param pulumi.Input[bool] outbound_calls_enabled: Specifies whether outbound calls are enabled.
               <!-- * `use_custom_tts_voices` - (Optional) Whether use custom tts voices is enabled. Defaults to `false` -->
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: InstanceArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides an Amazon Connect instance resource. For more information see
        [Amazon Connect: Getting Started](https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-get-started.html)

        !> **WARN:** Amazon Connect enforces a limit of [100 combined instance creation and deletions every 30 days](https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-service-limits.html#feature-limits).  For example, if you create 80 instances and delete 20 of them, you must wait 30 days to create or delete another instance.  Use care when creating or deleting instances.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        test = aws.connect.Instance("test",
            identity_management_type="CONNECT_MANAGED",
            inbound_calls_enabled=True,
            instance_alias="friendly-name-connect",
            outbound_calls_enabled=True)
        ```
        <!--End PulumiCodeChooser -->

        ### With Existing Active Directory

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        test = aws.connect.Instance("test",
            directory_id=test_aws_directory_service_directory["id"],
            identity_management_type="EXISTING_DIRECTORY",
            inbound_calls_enabled=True,
            instance_alias="friendly-name-connect",
            outbound_calls_enabled=True)
        ```
        <!--End PulumiCodeChooser -->

        ### With SAML

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_aws as aws

        test = aws.connect.Instance("test",
            identity_management_type="SAML",
            inbound_calls_enabled=True,
            instance_alias="friendly-name-connect",
            outbound_calls_enabled=True)
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Using `pulumi import`, import Connect instances using the `id`. For example:

        ```sh
        $ pulumi import aws:connect/instance:Instance example f1288a1f-6193-445a-b47e-af739b2
        ```

        :param str resource_name: The name of the resource.
        :param InstanceArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(InstanceArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 auto_resolve_best_voices_enabled: Optional[pulumi.Input[bool]] = None,
                 contact_flow_logs_enabled: Optional[pulumi.Input[bool]] = None,
                 contact_lens_enabled: Optional[pulumi.Input[bool]] = None,
                 directory_id: Optional[pulumi.Input[str]] = None,
                 early_media_enabled: Optional[pulumi.Input[bool]] = None,
                 identity_management_type: Optional[pulumi.Input[str]] = None,
                 inbound_calls_enabled: Optional[pulumi.Input[bool]] = None,
                 instance_alias: Optional[pulumi.Input[str]] = None,
                 multi_party_conference_enabled: Optional[pulumi.Input[bool]] = None,
                 outbound_calls_enabled: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = InstanceArgs.__new__(InstanceArgs)

            __props__.__dict__["auto_resolve_best_voices_enabled"] = auto_resolve_best_voices_enabled
            __props__.__dict__["contact_flow_logs_enabled"] = contact_flow_logs_enabled
            __props__.__dict__["contact_lens_enabled"] = contact_lens_enabled
            __props__.__dict__["directory_id"] = directory_id
            __props__.__dict__["early_media_enabled"] = early_media_enabled
            if identity_management_type is None and not opts.urn:
                raise TypeError("Missing required property 'identity_management_type'")
            __props__.__dict__["identity_management_type"] = identity_management_type
            if inbound_calls_enabled is None and not opts.urn:
                raise TypeError("Missing required property 'inbound_calls_enabled'")
            __props__.__dict__["inbound_calls_enabled"] = inbound_calls_enabled
            __props__.__dict__["instance_alias"] = instance_alias
            __props__.__dict__["multi_party_conference_enabled"] = multi_party_conference_enabled
            if outbound_calls_enabled is None and not opts.urn:
                raise TypeError("Missing required property 'outbound_calls_enabled'")
            __props__.__dict__["outbound_calls_enabled"] = outbound_calls_enabled
            __props__.__dict__["arn"] = None
            __props__.__dict__["created_time"] = None
            __props__.__dict__["service_role"] = None
            __props__.__dict__["status"] = None
        super(Instance, __self__).__init__(
            'aws:connect/instance:Instance',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            arn: Optional[pulumi.Input[str]] = None,
            auto_resolve_best_voices_enabled: Optional[pulumi.Input[bool]] = None,
            contact_flow_logs_enabled: Optional[pulumi.Input[bool]] = None,
            contact_lens_enabled: Optional[pulumi.Input[bool]] = None,
            created_time: Optional[pulumi.Input[str]] = None,
            directory_id: Optional[pulumi.Input[str]] = None,
            early_media_enabled: Optional[pulumi.Input[bool]] = None,
            identity_management_type: Optional[pulumi.Input[str]] = None,
            inbound_calls_enabled: Optional[pulumi.Input[bool]] = None,
            instance_alias: Optional[pulumi.Input[str]] = None,
            multi_party_conference_enabled: Optional[pulumi.Input[bool]] = None,
            outbound_calls_enabled: Optional[pulumi.Input[bool]] = None,
            service_role: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None) -> 'Instance':
        """
        Get an existing Instance resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] arn: Amazon Resource Name (ARN) of the instance.
        :param pulumi.Input[bool] auto_resolve_best_voices_enabled: Specifies whether auto resolve best voices is enabled. Defaults to `true`.
        :param pulumi.Input[bool] contact_flow_logs_enabled: Specifies whether contact flow logs are enabled. Defaults to `false`.
        :param pulumi.Input[bool] contact_lens_enabled: Specifies whether contact lens is enabled. Defaults to `true`.
        :param pulumi.Input[str] created_time: When the instance was created.
        :param pulumi.Input[str] directory_id: The identifier for the directory if identity_management_type is `EXISTING_DIRECTORY`.
        :param pulumi.Input[bool] early_media_enabled: Specifies whether early media for outbound calls is enabled . Defaults to `true` if outbound calls is enabled.
        :param pulumi.Input[str] identity_management_type: Specifies the identity management type attached to the instance. Allowed Values are: `SAML`, `CONNECT_MANAGED`, `EXISTING_DIRECTORY`.
        :param pulumi.Input[bool] inbound_calls_enabled: Specifies whether inbound calls are enabled.
        :param pulumi.Input[str] instance_alias: Specifies the name of the instance. Required if `directory_id` not specified.
        :param pulumi.Input[bool] multi_party_conference_enabled: Specifies whether multi-party calls/conference is enabled. Defaults to `false`.
        :param pulumi.Input[bool] outbound_calls_enabled: Specifies whether outbound calls are enabled.
               <!-- * `use_custom_tts_voices` - (Optional) Whether use custom tts voices is enabled. Defaults to `false` -->
        :param pulumi.Input[str] service_role: The service role of the instance.
        :param pulumi.Input[str] status: The state of the instance.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _InstanceState.__new__(_InstanceState)

        __props__.__dict__["arn"] = arn
        __props__.__dict__["auto_resolve_best_voices_enabled"] = auto_resolve_best_voices_enabled
        __props__.__dict__["contact_flow_logs_enabled"] = contact_flow_logs_enabled
        __props__.__dict__["contact_lens_enabled"] = contact_lens_enabled
        __props__.__dict__["created_time"] = created_time
        __props__.__dict__["directory_id"] = directory_id
        __props__.__dict__["early_media_enabled"] = early_media_enabled
        __props__.__dict__["identity_management_type"] = identity_management_type
        __props__.__dict__["inbound_calls_enabled"] = inbound_calls_enabled
        __props__.__dict__["instance_alias"] = instance_alias
        __props__.__dict__["multi_party_conference_enabled"] = multi_party_conference_enabled
        __props__.__dict__["outbound_calls_enabled"] = outbound_calls_enabled
        __props__.__dict__["service_role"] = service_role
        __props__.__dict__["status"] = status
        return Instance(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        Amazon Resource Name (ARN) of the instance.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="autoResolveBestVoicesEnabled")
    def auto_resolve_best_voices_enabled(self) -> pulumi.Output[Optional[bool]]:
        """
        Specifies whether auto resolve best voices is enabled. Defaults to `true`.
        """
        return pulumi.get(self, "auto_resolve_best_voices_enabled")

    @property
    @pulumi.getter(name="contactFlowLogsEnabled")
    def contact_flow_logs_enabled(self) -> pulumi.Output[Optional[bool]]:
        """
        Specifies whether contact flow logs are enabled. Defaults to `false`.
        """
        return pulumi.get(self, "contact_flow_logs_enabled")

    @property
    @pulumi.getter(name="contactLensEnabled")
    def contact_lens_enabled(self) -> pulumi.Output[Optional[bool]]:
        """
        Specifies whether contact lens is enabled. Defaults to `true`.
        """
        return pulumi.get(self, "contact_lens_enabled")

    @property
    @pulumi.getter(name="createdTime")
    def created_time(self) -> pulumi.Output[str]:
        """
        When the instance was created.
        """
        return pulumi.get(self, "created_time")

    @property
    @pulumi.getter(name="directoryId")
    def directory_id(self) -> pulumi.Output[Optional[str]]:
        """
        The identifier for the directory if identity_management_type is `EXISTING_DIRECTORY`.
        """
        return pulumi.get(self, "directory_id")

    @property
    @pulumi.getter(name="earlyMediaEnabled")
    def early_media_enabled(self) -> pulumi.Output[Optional[bool]]:
        """
        Specifies whether early media for outbound calls is enabled . Defaults to `true` if outbound calls is enabled.
        """
        return pulumi.get(self, "early_media_enabled")

    @property
    @pulumi.getter(name="identityManagementType")
    def identity_management_type(self) -> pulumi.Output[str]:
        """
        Specifies the identity management type attached to the instance. Allowed Values are: `SAML`, `CONNECT_MANAGED`, `EXISTING_DIRECTORY`.
        """
        return pulumi.get(self, "identity_management_type")

    @property
    @pulumi.getter(name="inboundCallsEnabled")
    def inbound_calls_enabled(self) -> pulumi.Output[bool]:
        """
        Specifies whether inbound calls are enabled.
        """
        return pulumi.get(self, "inbound_calls_enabled")

    @property
    @pulumi.getter(name="instanceAlias")
    def instance_alias(self) -> pulumi.Output[Optional[str]]:
        """
        Specifies the name of the instance. Required if `directory_id` not specified.
        """
        return pulumi.get(self, "instance_alias")

    @property
    @pulumi.getter(name="multiPartyConferenceEnabled")
    def multi_party_conference_enabled(self) -> pulumi.Output[Optional[bool]]:
        """
        Specifies whether multi-party calls/conference is enabled. Defaults to `false`.
        """
        return pulumi.get(self, "multi_party_conference_enabled")

    @property
    @pulumi.getter(name="outboundCallsEnabled")
    def outbound_calls_enabled(self) -> pulumi.Output[bool]:
        """
        Specifies whether outbound calls are enabled.
        <!-- * `use_custom_tts_voices` - (Optional) Whether use custom tts voices is enabled. Defaults to `false` -->
        """
        return pulumi.get(self, "outbound_calls_enabled")

    @property
    @pulumi.getter(name="serviceRole")
    def service_role(self) -> pulumi.Output[str]:
        """
        The service role of the instance.
        """
        return pulumi.get(self, "service_role")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        The state of the instance.
        """
        return pulumi.get(self, "status")

