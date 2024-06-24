# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs
from ._inputs import *

__all__ = ['AppArgs', 'App']

@pulumi.input_type
class AppArgs:
    def __init__(__self__, *,
                 campaign_hook: Optional[pulumi.Input['AppCampaignHookArgs']] = None,
                 limits: Optional[pulumi.Input['AppLimitsArgs']] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 name_prefix: Optional[pulumi.Input[str]] = None,
                 quiet_time: Optional[pulumi.Input['AppQuietTimeArgs']] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a App resource.
        :param pulumi.Input['AppCampaignHookArgs'] campaign_hook: Specifies settings for invoking an AWS Lambda function that customizes a segment for a campaign
        :param pulumi.Input['AppLimitsArgs'] limits: The default campaign limits for the app. These limits apply to each campaign for the app, unless the campaign overrides the default with limits of its own
        :param pulumi.Input[str] name: The application name. By default generated by Pulumi
        :param pulumi.Input[str] name_prefix: The name of the Pinpoint application. Conflicts with `name`
        :param pulumi.Input['AppQuietTimeArgs'] quiet_time: The default quiet time for the app. Each campaign for this app sends no messages during this time unless the campaign overrides the default with a quiet time of its own
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        if campaign_hook is not None:
            pulumi.set(__self__, "campaign_hook", campaign_hook)
        if limits is not None:
            pulumi.set(__self__, "limits", limits)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if name_prefix is not None:
            pulumi.set(__self__, "name_prefix", name_prefix)
        if quiet_time is not None:
            pulumi.set(__self__, "quiet_time", quiet_time)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="campaignHook")
    def campaign_hook(self) -> Optional[pulumi.Input['AppCampaignHookArgs']]:
        """
        Specifies settings for invoking an AWS Lambda function that customizes a segment for a campaign
        """
        return pulumi.get(self, "campaign_hook")

    @campaign_hook.setter
    def campaign_hook(self, value: Optional[pulumi.Input['AppCampaignHookArgs']]):
        pulumi.set(self, "campaign_hook", value)

    @property
    @pulumi.getter
    def limits(self) -> Optional[pulumi.Input['AppLimitsArgs']]:
        """
        The default campaign limits for the app. These limits apply to each campaign for the app, unless the campaign overrides the default with limits of its own
        """
        return pulumi.get(self, "limits")

    @limits.setter
    def limits(self, value: Optional[pulumi.Input['AppLimitsArgs']]):
        pulumi.set(self, "limits", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The application name. By default generated by Pulumi
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="namePrefix")
    def name_prefix(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Pinpoint application. Conflicts with `name`
        """
        return pulumi.get(self, "name_prefix")

    @name_prefix.setter
    def name_prefix(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name_prefix", value)

    @property
    @pulumi.getter(name="quietTime")
    def quiet_time(self) -> Optional[pulumi.Input['AppQuietTimeArgs']]:
        """
        The default quiet time for the app. Each campaign for this app sends no messages during this time unless the campaign overrides the default with a quiet time of its own
        """
        return pulumi.get(self, "quiet_time")

    @quiet_time.setter
    def quiet_time(self, value: Optional[pulumi.Input['AppQuietTimeArgs']]):
        pulumi.set(self, "quiet_time", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _AppState:
    def __init__(__self__, *,
                 application_id: Optional[pulumi.Input[str]] = None,
                 arn: Optional[pulumi.Input[str]] = None,
                 campaign_hook: Optional[pulumi.Input['AppCampaignHookArgs']] = None,
                 limits: Optional[pulumi.Input['AppLimitsArgs']] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 name_prefix: Optional[pulumi.Input[str]] = None,
                 quiet_time: Optional[pulumi.Input['AppQuietTimeArgs']] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        Input properties used for looking up and filtering App resources.
        :param pulumi.Input[str] application_id: The Application ID of the Pinpoint App.
        :param pulumi.Input[str] arn: Amazon Resource Name (ARN) of the PinPoint Application
        :param pulumi.Input['AppCampaignHookArgs'] campaign_hook: Specifies settings for invoking an AWS Lambda function that customizes a segment for a campaign
        :param pulumi.Input['AppLimitsArgs'] limits: The default campaign limits for the app. These limits apply to each campaign for the app, unless the campaign overrides the default with limits of its own
        :param pulumi.Input[str] name: The application name. By default generated by Pulumi
        :param pulumi.Input[str] name_prefix: The name of the Pinpoint application. Conflicts with `name`
        :param pulumi.Input['AppQuietTimeArgs'] quiet_time: The default quiet time for the app. Each campaign for this app sends no messages during this time unless the campaign overrides the default with a quiet time of its own
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        if application_id is not None:
            pulumi.set(__self__, "application_id", application_id)
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if campaign_hook is not None:
            pulumi.set(__self__, "campaign_hook", campaign_hook)
        if limits is not None:
            pulumi.set(__self__, "limits", limits)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if name_prefix is not None:
            pulumi.set(__self__, "name_prefix", name_prefix)
        if quiet_time is not None:
            pulumi.set(__self__, "quiet_time", quiet_time)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if tags_all is not None:
            warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
            pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")
        if tags_all is not None:
            pulumi.set(__self__, "tags_all", tags_all)

    @property
    @pulumi.getter(name="applicationId")
    def application_id(self) -> Optional[pulumi.Input[str]]:
        """
        The Application ID of the Pinpoint App.
        """
        return pulumi.get(self, "application_id")

    @application_id.setter
    def application_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "application_id", value)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        Amazon Resource Name (ARN) of the PinPoint Application
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter(name="campaignHook")
    def campaign_hook(self) -> Optional[pulumi.Input['AppCampaignHookArgs']]:
        """
        Specifies settings for invoking an AWS Lambda function that customizes a segment for a campaign
        """
        return pulumi.get(self, "campaign_hook")

    @campaign_hook.setter
    def campaign_hook(self, value: Optional[pulumi.Input['AppCampaignHookArgs']]):
        pulumi.set(self, "campaign_hook", value)

    @property
    @pulumi.getter
    def limits(self) -> Optional[pulumi.Input['AppLimitsArgs']]:
        """
        The default campaign limits for the app. These limits apply to each campaign for the app, unless the campaign overrides the default with limits of its own
        """
        return pulumi.get(self, "limits")

    @limits.setter
    def limits(self, value: Optional[pulumi.Input['AppLimitsArgs']]):
        pulumi.set(self, "limits", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The application name. By default generated by Pulumi
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="namePrefix")
    def name_prefix(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the Pinpoint application. Conflicts with `name`
        """
        return pulumi.get(self, "name_prefix")

    @name_prefix.setter
    def name_prefix(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name_prefix", value)

    @property
    @pulumi.getter(name="quietTime")
    def quiet_time(self) -> Optional[pulumi.Input['AppQuietTimeArgs']]:
        """
        The default quiet time for the app. Each campaign for this app sends no messages during this time unless the campaign overrides the default with a quiet time of its own
        """
        return pulumi.get(self, "quiet_time")

    @quiet_time.setter
    def quiet_time(self, value: Optional[pulumi.Input['AppQuietTimeArgs']]):
        pulumi.set(self, "quiet_time", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="tagsAll")
    @_utilities.deprecated("""Please use `tags` instead.""")
    def tags_all(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        return pulumi.get(self, "tags_all")

    @tags_all.setter
    def tags_all(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags_all", value)


class App(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 campaign_hook: Optional[pulumi.Input[pulumi.InputType['AppCampaignHookArgs']]] = None,
                 limits: Optional[pulumi.Input[pulumi.InputType['AppLimitsArgs']]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 name_prefix: Optional[pulumi.Input[str]] = None,
                 quiet_time: Optional[pulumi.Input[pulumi.InputType['AppQuietTimeArgs']]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        Provides a Pinpoint App resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.pinpoint.App("example",
            name="test-app",
            limits=aws.pinpoint.AppLimitsArgs(
                maximum_duration=600,
            ),
            quiet_time=aws.pinpoint.AppQuietTimeArgs(
                start="00:00",
                end="06:00",
            ))
        ```

        ## Import

        Using `pulumi import`, import Pinpoint App using the `application-id`. For example:

        ```sh
        $ pulumi import aws:pinpoint/app:App name application-id
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['AppCampaignHookArgs']] campaign_hook: Specifies settings for invoking an AWS Lambda function that customizes a segment for a campaign
        :param pulumi.Input[pulumi.InputType['AppLimitsArgs']] limits: The default campaign limits for the app. These limits apply to each campaign for the app, unless the campaign overrides the default with limits of its own
        :param pulumi.Input[str] name: The application name. By default generated by Pulumi
        :param pulumi.Input[str] name_prefix: The name of the Pinpoint application. Conflicts with `name`
        :param pulumi.Input[pulumi.InputType['AppQuietTimeArgs']] quiet_time: The default quiet time for the app. Each campaign for this app sends no messages during this time unless the campaign overrides the default with a quiet time of its own
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[AppArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Pinpoint App resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.pinpoint.App("example",
            name="test-app",
            limits=aws.pinpoint.AppLimitsArgs(
                maximum_duration=600,
            ),
            quiet_time=aws.pinpoint.AppQuietTimeArgs(
                start="00:00",
                end="06:00",
            ))
        ```

        ## Import

        Using `pulumi import`, import Pinpoint App using the `application-id`. For example:

        ```sh
        $ pulumi import aws:pinpoint/app:App name application-id
        ```

        :param str resource_name: The name of the resource.
        :param AppArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AppArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 campaign_hook: Optional[pulumi.Input[pulumi.InputType['AppCampaignHookArgs']]] = None,
                 limits: Optional[pulumi.Input[pulumi.InputType['AppLimitsArgs']]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 name_prefix: Optional[pulumi.Input[str]] = None,
                 quiet_time: Optional[pulumi.Input[pulumi.InputType['AppQuietTimeArgs']]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AppArgs.__new__(AppArgs)

            __props__.__dict__["campaign_hook"] = campaign_hook
            __props__.__dict__["limits"] = limits
            __props__.__dict__["name"] = name
            __props__.__dict__["name_prefix"] = name_prefix
            __props__.__dict__["quiet_time"] = quiet_time
            __props__.__dict__["tags"] = tags
            __props__.__dict__["application_id"] = None
            __props__.__dict__["arn"] = None
            __props__.__dict__["tags_all"] = None
        super(App, __self__).__init__(
            'aws:pinpoint/app:App',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            application_id: Optional[pulumi.Input[str]] = None,
            arn: Optional[pulumi.Input[str]] = None,
            campaign_hook: Optional[pulumi.Input[pulumi.InputType['AppCampaignHookArgs']]] = None,
            limits: Optional[pulumi.Input[pulumi.InputType['AppLimitsArgs']]] = None,
            name: Optional[pulumi.Input[str]] = None,
            name_prefix: Optional[pulumi.Input[str]] = None,
            quiet_time: Optional[pulumi.Input[pulumi.InputType['AppQuietTimeArgs']]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None) -> 'App':
        """
        Get an existing App resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] application_id: The Application ID of the Pinpoint App.
        :param pulumi.Input[str] arn: Amazon Resource Name (ARN) of the PinPoint Application
        :param pulumi.Input[pulumi.InputType['AppCampaignHookArgs']] campaign_hook: Specifies settings for invoking an AWS Lambda function that customizes a segment for a campaign
        :param pulumi.Input[pulumi.InputType['AppLimitsArgs']] limits: The default campaign limits for the app. These limits apply to each campaign for the app, unless the campaign overrides the default with limits of its own
        :param pulumi.Input[str] name: The application name. By default generated by Pulumi
        :param pulumi.Input[str] name_prefix: The name of the Pinpoint application. Conflicts with `name`
        :param pulumi.Input[pulumi.InputType['AppQuietTimeArgs']] quiet_time: The default quiet time for the app. Each campaign for this app sends no messages during this time unless the campaign overrides the default with a quiet time of its own
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AppState.__new__(_AppState)

        __props__.__dict__["application_id"] = application_id
        __props__.__dict__["arn"] = arn
        __props__.__dict__["campaign_hook"] = campaign_hook
        __props__.__dict__["limits"] = limits
        __props__.__dict__["name"] = name
        __props__.__dict__["name_prefix"] = name_prefix
        __props__.__dict__["quiet_time"] = quiet_time
        __props__.__dict__["tags"] = tags
        __props__.__dict__["tags_all"] = tags_all
        return App(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="applicationId")
    def application_id(self) -> pulumi.Output[str]:
        """
        The Application ID of the Pinpoint App.
        """
        return pulumi.get(self, "application_id")

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        Amazon Resource Name (ARN) of the PinPoint Application
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="campaignHook")
    def campaign_hook(self) -> pulumi.Output[Optional['outputs.AppCampaignHook']]:
        """
        Specifies settings for invoking an AWS Lambda function that customizes a segment for a campaign
        """
        return pulumi.get(self, "campaign_hook")

    @property
    @pulumi.getter
    def limits(self) -> pulumi.Output[Optional['outputs.AppLimits']]:
        """
        The default campaign limits for the app. These limits apply to each campaign for the app, unless the campaign overrides the default with limits of its own
        """
        return pulumi.get(self, "limits")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The application name. By default generated by Pulumi
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="namePrefix")
    def name_prefix(self) -> pulumi.Output[str]:
        """
        The name of the Pinpoint application. Conflicts with `name`
        """
        return pulumi.get(self, "name_prefix")

    @property
    @pulumi.getter(name="quietTime")
    def quiet_time(self) -> pulumi.Output[Optional['outputs.AppQuietTime']]:
        """
        The default quiet time for the app. Each campaign for this app sends no messages during this time unless the campaign overrides the default with a quiet time of its own
        """
        return pulumi.get(self, "quiet_time")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="tagsAll")
    @_utilities.deprecated("""Please use `tags` instead.""")
    def tags_all(self) -> pulumi.Output[Mapping[str, str]]:
        """
        A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        return pulumi.get(self, "tags_all")

