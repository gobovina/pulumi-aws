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

__all__ = ['WebhookArgs', 'Webhook']

@pulumi.input_type
class WebhookArgs:
    def __init__(__self__, *,
                 project_name: pulumi.Input[str],
                 branch_filter: Optional[pulumi.Input[str]] = None,
                 build_type: Optional[pulumi.Input[str]] = None,
                 filter_groups: Optional[pulumi.Input[Sequence[pulumi.Input['WebhookFilterGroupArgs']]]] = None):
        """
        The set of arguments for constructing a Webhook resource.
        :param pulumi.Input[str] project_name: The name of the build project.
        :param pulumi.Input[str] branch_filter: A regular expression used to determine which branches get built. Default is all branches are built. We recommend using `filter_group` over `branch_filter`.
        :param pulumi.Input[str] build_type: The type of build this webhook will trigger. Valid values for this parameter are: `BUILD`, `BUILD_BATCH`.
        :param pulumi.Input[Sequence[pulumi.Input['WebhookFilterGroupArgs']]] filter_groups: Information about the webhook's trigger. Filter group blocks are documented below.
        """
        pulumi.set(__self__, "project_name", project_name)
        if branch_filter is not None:
            pulumi.set(__self__, "branch_filter", branch_filter)
        if build_type is not None:
            pulumi.set(__self__, "build_type", build_type)
        if filter_groups is not None:
            pulumi.set(__self__, "filter_groups", filter_groups)

    @property
    @pulumi.getter(name="projectName")
    def project_name(self) -> pulumi.Input[str]:
        """
        The name of the build project.
        """
        return pulumi.get(self, "project_name")

    @project_name.setter
    def project_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "project_name", value)

    @property
    @pulumi.getter(name="branchFilter")
    def branch_filter(self) -> Optional[pulumi.Input[str]]:
        """
        A regular expression used to determine which branches get built. Default is all branches are built. We recommend using `filter_group` over `branch_filter`.
        """
        return pulumi.get(self, "branch_filter")

    @branch_filter.setter
    def branch_filter(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "branch_filter", value)

    @property
    @pulumi.getter(name="buildType")
    def build_type(self) -> Optional[pulumi.Input[str]]:
        """
        The type of build this webhook will trigger. Valid values for this parameter are: `BUILD`, `BUILD_BATCH`.
        """
        return pulumi.get(self, "build_type")

    @build_type.setter
    def build_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "build_type", value)

    @property
    @pulumi.getter(name="filterGroups")
    def filter_groups(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['WebhookFilterGroupArgs']]]]:
        """
        Information about the webhook's trigger. Filter group blocks are documented below.
        """
        return pulumi.get(self, "filter_groups")

    @filter_groups.setter
    def filter_groups(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['WebhookFilterGroupArgs']]]]):
        pulumi.set(self, "filter_groups", value)


@pulumi.input_type
class _WebhookState:
    def __init__(__self__, *,
                 branch_filter: Optional[pulumi.Input[str]] = None,
                 build_type: Optional[pulumi.Input[str]] = None,
                 filter_groups: Optional[pulumi.Input[Sequence[pulumi.Input['WebhookFilterGroupArgs']]]] = None,
                 payload_url: Optional[pulumi.Input[str]] = None,
                 project_name: Optional[pulumi.Input[str]] = None,
                 secret: Optional[pulumi.Input[str]] = None,
                 url: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Webhook resources.
        :param pulumi.Input[str] branch_filter: A regular expression used to determine which branches get built. Default is all branches are built. We recommend using `filter_group` over `branch_filter`.
        :param pulumi.Input[str] build_type: The type of build this webhook will trigger. Valid values for this parameter are: `BUILD`, `BUILD_BATCH`.
        :param pulumi.Input[Sequence[pulumi.Input['WebhookFilterGroupArgs']]] filter_groups: Information about the webhook's trigger. Filter group blocks are documented below.
        :param pulumi.Input[str] payload_url: The CodeBuild endpoint where webhook events are sent.
        :param pulumi.Input[str] project_name: The name of the build project.
        :param pulumi.Input[str] secret: The secret token of the associated repository. Not returned by the CodeBuild API for all source types.
        :param pulumi.Input[str] url: The URL to the webhook.
        """
        if branch_filter is not None:
            pulumi.set(__self__, "branch_filter", branch_filter)
        if build_type is not None:
            pulumi.set(__self__, "build_type", build_type)
        if filter_groups is not None:
            pulumi.set(__self__, "filter_groups", filter_groups)
        if payload_url is not None:
            pulumi.set(__self__, "payload_url", payload_url)
        if project_name is not None:
            pulumi.set(__self__, "project_name", project_name)
        if secret is not None:
            pulumi.set(__self__, "secret", secret)
        if url is not None:
            pulumi.set(__self__, "url", url)

    @property
    @pulumi.getter(name="branchFilter")
    def branch_filter(self) -> Optional[pulumi.Input[str]]:
        """
        A regular expression used to determine which branches get built. Default is all branches are built. We recommend using `filter_group` over `branch_filter`.
        """
        return pulumi.get(self, "branch_filter")

    @branch_filter.setter
    def branch_filter(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "branch_filter", value)

    @property
    @pulumi.getter(name="buildType")
    def build_type(self) -> Optional[pulumi.Input[str]]:
        """
        The type of build this webhook will trigger. Valid values for this parameter are: `BUILD`, `BUILD_BATCH`.
        """
        return pulumi.get(self, "build_type")

    @build_type.setter
    def build_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "build_type", value)

    @property
    @pulumi.getter(name="filterGroups")
    def filter_groups(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['WebhookFilterGroupArgs']]]]:
        """
        Information about the webhook's trigger. Filter group blocks are documented below.
        """
        return pulumi.get(self, "filter_groups")

    @filter_groups.setter
    def filter_groups(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['WebhookFilterGroupArgs']]]]):
        pulumi.set(self, "filter_groups", value)

    @property
    @pulumi.getter(name="payloadUrl")
    def payload_url(self) -> Optional[pulumi.Input[str]]:
        """
        The CodeBuild endpoint where webhook events are sent.
        """
        return pulumi.get(self, "payload_url")

    @payload_url.setter
    def payload_url(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "payload_url", value)

    @property
    @pulumi.getter(name="projectName")
    def project_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the build project.
        """
        return pulumi.get(self, "project_name")

    @project_name.setter
    def project_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "project_name", value)

    @property
    @pulumi.getter
    def secret(self) -> Optional[pulumi.Input[str]]:
        """
        The secret token of the associated repository. Not returned by the CodeBuild API for all source types.
        """
        return pulumi.get(self, "secret")

    @secret.setter
    def secret(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "secret", value)

    @property
    @pulumi.getter
    def url(self) -> Optional[pulumi.Input[str]]:
        """
        The URL to the webhook.
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
                 branch_filter: Optional[pulumi.Input[str]] = None,
                 build_type: Optional[pulumi.Input[str]] = None,
                 filter_groups: Optional[pulumi.Input[Sequence[pulumi.Input[Union['WebhookFilterGroupArgs', 'WebhookFilterGroupArgsDict']]]]] = None,
                 project_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Manages a CodeBuild webhook, which is an endpoint accepted by the CodeBuild service to trigger builds from source code repositories. Depending on the source type of the CodeBuild project, the CodeBuild service may also automatically create and delete the actual repository webhook as well.

        ## Example Usage

        ### Bitbucket and GitHub

        When working with [Bitbucket](https://bitbucket.org) and [GitHub](https://github.com) source CodeBuild webhooks, the CodeBuild service will automatically create (on `codebuild.Webhook` resource creation) and delete (on `codebuild.Webhook` resource deletion) the Bitbucket/GitHub repository webhook using its granted OAuth permissions. This behavior cannot be controlled by this provider.

        > **Note:** The AWS account that this provider uses to create this resource *must* have authorized CodeBuild to access Bitbucket/GitHub's OAuth API in each applicable region. This is a manual step that must be done *before* creating webhooks with this resource. If OAuth is not configured, AWS will return an error similar to `ResourceNotFoundException: Could not find access token for server type github`. More information can be found in the CodeBuild User Guide for [Bitbucket](https://docs.aws.amazon.com/codebuild/latest/userguide/sample-bitbucket-pull-request.html) and [GitHub](https://docs.aws.amazon.com/codebuild/latest/userguide/sample-github-pull-request.html).

        > **Note:** Further managing the automatically created Bitbucket/GitHub webhook with the `bitbucket_hook`/`github_repository_webhook` resource is only possible with importing that resource after creation of the `codebuild.Webhook` resource. The CodeBuild API does not ever provide the `secret` attribute for the `codebuild.Webhook` resource in this scenario.

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.codebuild.Webhook("example",
            project_name=example_aws_codebuild_project["name"],
            build_type="BUILD",
            filter_groups=[{
                "filters": [
                    {
                        "type": "EVENT",
                        "pattern": "PUSH",
                    },
                    {
                        "type": "BASE_REF",
                        "pattern": "master",
                    },
                ],
            }])
        ```

        ## Import

        Using `pulumi import`, import CodeBuild Webhooks using the CodeBuild Project name. For example:

        ```sh
        $ pulumi import aws:codebuild/webhook:Webhook example MyProjectName
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] branch_filter: A regular expression used to determine which branches get built. Default is all branches are built. We recommend using `filter_group` over `branch_filter`.
        :param pulumi.Input[str] build_type: The type of build this webhook will trigger. Valid values for this parameter are: `BUILD`, `BUILD_BATCH`.
        :param pulumi.Input[Sequence[pulumi.Input[Union['WebhookFilterGroupArgs', 'WebhookFilterGroupArgsDict']]]] filter_groups: Information about the webhook's trigger. Filter group blocks are documented below.
        :param pulumi.Input[str] project_name: The name of the build project.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: WebhookArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a CodeBuild webhook, which is an endpoint accepted by the CodeBuild service to trigger builds from source code repositories. Depending on the source type of the CodeBuild project, the CodeBuild service may also automatically create and delete the actual repository webhook as well.

        ## Example Usage

        ### Bitbucket and GitHub

        When working with [Bitbucket](https://bitbucket.org) and [GitHub](https://github.com) source CodeBuild webhooks, the CodeBuild service will automatically create (on `codebuild.Webhook` resource creation) and delete (on `codebuild.Webhook` resource deletion) the Bitbucket/GitHub repository webhook using its granted OAuth permissions. This behavior cannot be controlled by this provider.

        > **Note:** The AWS account that this provider uses to create this resource *must* have authorized CodeBuild to access Bitbucket/GitHub's OAuth API in each applicable region. This is a manual step that must be done *before* creating webhooks with this resource. If OAuth is not configured, AWS will return an error similar to `ResourceNotFoundException: Could not find access token for server type github`. More information can be found in the CodeBuild User Guide for [Bitbucket](https://docs.aws.amazon.com/codebuild/latest/userguide/sample-bitbucket-pull-request.html) and [GitHub](https://docs.aws.amazon.com/codebuild/latest/userguide/sample-github-pull-request.html).

        > **Note:** Further managing the automatically created Bitbucket/GitHub webhook with the `bitbucket_hook`/`github_repository_webhook` resource is only possible with importing that resource after creation of the `codebuild.Webhook` resource. The CodeBuild API does not ever provide the `secret` attribute for the `codebuild.Webhook` resource in this scenario.

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.codebuild.Webhook("example",
            project_name=example_aws_codebuild_project["name"],
            build_type="BUILD",
            filter_groups=[{
                "filters": [
                    {
                        "type": "EVENT",
                        "pattern": "PUSH",
                    },
                    {
                        "type": "BASE_REF",
                        "pattern": "master",
                    },
                ],
            }])
        ```

        ## Import

        Using `pulumi import`, import CodeBuild Webhooks using the CodeBuild Project name. For example:

        ```sh
        $ pulumi import aws:codebuild/webhook:Webhook example MyProjectName
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
                 branch_filter: Optional[pulumi.Input[str]] = None,
                 build_type: Optional[pulumi.Input[str]] = None,
                 filter_groups: Optional[pulumi.Input[Sequence[pulumi.Input[Union['WebhookFilterGroupArgs', 'WebhookFilterGroupArgsDict']]]]] = None,
                 project_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = WebhookArgs.__new__(WebhookArgs)

            __props__.__dict__["branch_filter"] = branch_filter
            __props__.__dict__["build_type"] = build_type
            __props__.__dict__["filter_groups"] = filter_groups
            if project_name is None and not opts.urn:
                raise TypeError("Missing required property 'project_name'")
            __props__.__dict__["project_name"] = project_name
            __props__.__dict__["payload_url"] = None
            __props__.__dict__["secret"] = None
            __props__.__dict__["url"] = None
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["secret"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(Webhook, __self__).__init__(
            'aws:codebuild/webhook:Webhook',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            branch_filter: Optional[pulumi.Input[str]] = None,
            build_type: Optional[pulumi.Input[str]] = None,
            filter_groups: Optional[pulumi.Input[Sequence[pulumi.Input[Union['WebhookFilterGroupArgs', 'WebhookFilterGroupArgsDict']]]]] = None,
            payload_url: Optional[pulumi.Input[str]] = None,
            project_name: Optional[pulumi.Input[str]] = None,
            secret: Optional[pulumi.Input[str]] = None,
            url: Optional[pulumi.Input[str]] = None) -> 'Webhook':
        """
        Get an existing Webhook resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] branch_filter: A regular expression used to determine which branches get built. Default is all branches are built. We recommend using `filter_group` over `branch_filter`.
        :param pulumi.Input[str] build_type: The type of build this webhook will trigger. Valid values for this parameter are: `BUILD`, `BUILD_BATCH`.
        :param pulumi.Input[Sequence[pulumi.Input[Union['WebhookFilterGroupArgs', 'WebhookFilterGroupArgsDict']]]] filter_groups: Information about the webhook's trigger. Filter group blocks are documented below.
        :param pulumi.Input[str] payload_url: The CodeBuild endpoint where webhook events are sent.
        :param pulumi.Input[str] project_name: The name of the build project.
        :param pulumi.Input[str] secret: The secret token of the associated repository. Not returned by the CodeBuild API for all source types.
        :param pulumi.Input[str] url: The URL to the webhook.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _WebhookState.__new__(_WebhookState)

        __props__.__dict__["branch_filter"] = branch_filter
        __props__.__dict__["build_type"] = build_type
        __props__.__dict__["filter_groups"] = filter_groups
        __props__.__dict__["payload_url"] = payload_url
        __props__.__dict__["project_name"] = project_name
        __props__.__dict__["secret"] = secret
        __props__.__dict__["url"] = url
        return Webhook(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="branchFilter")
    def branch_filter(self) -> pulumi.Output[Optional[str]]:
        """
        A regular expression used to determine which branches get built. Default is all branches are built. We recommend using `filter_group` over `branch_filter`.
        """
        return pulumi.get(self, "branch_filter")

    @property
    @pulumi.getter(name="buildType")
    def build_type(self) -> pulumi.Output[Optional[str]]:
        """
        The type of build this webhook will trigger. Valid values for this parameter are: `BUILD`, `BUILD_BATCH`.
        """
        return pulumi.get(self, "build_type")

    @property
    @pulumi.getter(name="filterGroups")
    def filter_groups(self) -> pulumi.Output[Optional[Sequence['outputs.WebhookFilterGroup']]]:
        """
        Information about the webhook's trigger. Filter group blocks are documented below.
        """
        return pulumi.get(self, "filter_groups")

    @property
    @pulumi.getter(name="payloadUrl")
    def payload_url(self) -> pulumi.Output[str]:
        """
        The CodeBuild endpoint where webhook events are sent.
        """
        return pulumi.get(self, "payload_url")

    @property
    @pulumi.getter(name="projectName")
    def project_name(self) -> pulumi.Output[str]:
        """
        The name of the build project.
        """
        return pulumi.get(self, "project_name")

    @property
    @pulumi.getter
    def secret(self) -> pulumi.Output[str]:
        """
        The secret token of the associated repository. Not returned by the CodeBuild API for all source types.
        """
        return pulumi.get(self, "secret")

    @property
    @pulumi.getter
    def url(self) -> pulumi.Output[str]:
        """
        The URL to the webhook.
        """
        return pulumi.get(self, "url")

