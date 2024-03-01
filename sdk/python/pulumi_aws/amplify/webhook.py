# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['WebhookArgs', 'Webhook']

@pulumi.input_type
class WebhookArgs:
    def __init__(__self__, *,
                 app_id: pulumi.Input[str],
                 branch_name: pulumi.Input[str],
                 description: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Webhook resource.
        :param pulumi.Input[str] app_id: Unique ID for an Amplify app.
        :param pulumi.Input[str] branch_name: Name for a branch that is part of the Amplify app.
        :param pulumi.Input[str] description: Description for a webhook.
        """
        pulumi.set(__self__, "app_id", app_id)
        pulumi.set(__self__, "branch_name", branch_name)
        if description is not None:
            pulumi.set(__self__, "description", description)

    @property
    @pulumi.getter(name="appId")
    def app_id(self) -> pulumi.Input[str]:
        """
        Unique ID for an Amplify app.
        """
        return pulumi.get(self, "app_id")

    @app_id.setter
    def app_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "app_id", value)

    @property
    @pulumi.getter(name="branchName")
    def branch_name(self) -> pulumi.Input[str]:
        """
        Name for a branch that is part of the Amplify app.
        """
        return pulumi.get(self, "branch_name")

    @branch_name.setter
    def branch_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "branch_name", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Description for a webhook.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)


@pulumi.input_type
class _WebhookState:
    def __init__(__self__, *,
                 app_id: Optional[pulumi.Input[str]] = None,
                 arn: Optional[pulumi.Input[str]] = None,
                 branch_name: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 url: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Webhook resources.
        :param pulumi.Input[str] app_id: Unique ID for an Amplify app.
        :param pulumi.Input[str] arn: ARN for the webhook.
        :param pulumi.Input[str] branch_name: Name for a branch that is part of the Amplify app.
        :param pulumi.Input[str] description: Description for a webhook.
        :param pulumi.Input[str] url: URL of the webhook.
        """
        if app_id is not None:
            pulumi.set(__self__, "app_id", app_id)
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if branch_name is not None:
            pulumi.set(__self__, "branch_name", branch_name)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if url is not None:
            pulumi.set(__self__, "url", url)

    @property
    @pulumi.getter(name="appId")
    def app_id(self) -> Optional[pulumi.Input[str]]:
        """
        Unique ID for an Amplify app.
        """
        return pulumi.get(self, "app_id")

    @app_id.setter
    def app_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "app_id", value)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        ARN for the webhook.
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter(name="branchName")
    def branch_name(self) -> Optional[pulumi.Input[str]]:
        """
        Name for a branch that is part of the Amplify app.
        """
        return pulumi.get(self, "branch_name")

    @branch_name.setter
    def branch_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "branch_name", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Description for a webhook.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def url(self) -> Optional[pulumi.Input[str]]:
        """
        URL of the webhook.
        """
        return pulumi.get(self, "url")

    @url.setter
    def url(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "url", value)


class Webhook(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 app_id: Optional[pulumi.Input[str]] = None,
                 branch_name: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides an Amplify Webhook resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.amplify.App("example", name="app")
        master = aws.amplify.Branch("master",
            app_id=example.id,
            branch_name="master")
        master_webhook = aws.amplify.Webhook("master",
            app_id=example.id,
            branch_name=master.branch_name,
            description="triggermaster")
        ```

        ## Import

        Using `pulumi import`, import Amplify webhook using a webhook ID. For example:

        ```sh
         $ pulumi import aws:amplify/webhook:Webhook master a26b22a0-748b-4b57-b9a0-ae7e601fe4b1
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] app_id: Unique ID for an Amplify app.
        :param pulumi.Input[str] branch_name: Name for a branch that is part of the Amplify app.
        :param pulumi.Input[str] description: Description for a webhook.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: WebhookArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides an Amplify Webhook resource.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.amplify.App("example", name="app")
        master = aws.amplify.Branch("master",
            app_id=example.id,
            branch_name="master")
        master_webhook = aws.amplify.Webhook("master",
            app_id=example.id,
            branch_name=master.branch_name,
            description="triggermaster")
        ```

        ## Import

        Using `pulumi import`, import Amplify webhook using a webhook ID. For example:

        ```sh
         $ pulumi import aws:amplify/webhook:Webhook master a26b22a0-748b-4b57-b9a0-ae7e601fe4b1
        ```

        :param str resource_name: The name of the resource.
        :param WebhookArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(WebhookArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 app_id: Optional[pulumi.Input[str]] = None,
                 branch_name: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = WebhookArgs.__new__(WebhookArgs)

            if app_id is None and not opts.urn:
                raise TypeError("Missing required property 'app_id'")
            __props__.__dict__["app_id"] = app_id
            if branch_name is None and not opts.urn:
                raise TypeError("Missing required property 'branch_name'")
            __props__.__dict__["branch_name"] = branch_name
            __props__.__dict__["description"] = description
            __props__.__dict__["arn"] = None
            __props__.__dict__["url"] = None
        super(Webhook, __self__).__init__(
            'aws:amplify/webhook:Webhook',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            app_id: Optional[pulumi.Input[str]] = None,
            arn: Optional[pulumi.Input[str]] = None,
            branch_name: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            url: Optional[pulumi.Input[str]] = None) -> 'Webhook':
        """
        Get an existing Webhook resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] app_id: Unique ID for an Amplify app.
        :param pulumi.Input[str] arn: ARN for the webhook.
        :param pulumi.Input[str] branch_name: Name for a branch that is part of the Amplify app.
        :param pulumi.Input[str] description: Description for a webhook.
        :param pulumi.Input[str] url: URL of the webhook.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _WebhookState.__new__(_WebhookState)

        __props__.__dict__["app_id"] = app_id
        __props__.__dict__["arn"] = arn
        __props__.__dict__["branch_name"] = branch_name
        __props__.__dict__["description"] = description
        __props__.__dict__["url"] = url
        return Webhook(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="appId")
    def app_id(self) -> pulumi.Output[str]:
        """
        Unique ID for an Amplify app.
        """
        return pulumi.get(self, "app_id")

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        ARN for the webhook.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter(name="branchName")
    def branch_name(self) -> pulumi.Output[str]:
        """
        Name for a branch that is part of the Amplify app.
        """
        return pulumi.get(self, "branch_name")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        Description for a webhook.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def url(self) -> pulumi.Output[str]:
        """
        URL of the webhook.
        """
        return pulumi.get(self, "url")

