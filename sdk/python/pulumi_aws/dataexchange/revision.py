# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['RevisionArgs', 'Revision']

@pulumi.input_type
class RevisionArgs:
    def __init__(__self__, *,
                 data_set_id: pulumi.Input[str],
                 comment: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a Revision resource.
        :param pulumi.Input[str] data_set_id: The dataset id.
        :param pulumi.Input[str] comment: An optional comment about the revision.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        pulumi.set(__self__, "data_set_id", data_set_id)
        if comment is not None:
            pulumi.set(__self__, "comment", comment)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="dataSetId")
    def data_set_id(self) -> pulumi.Input[str]:
        """
        The dataset id.
        """
        return pulumi.get(self, "data_set_id")

    @data_set_id.setter
    def data_set_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "data_set_id", value)

    @property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[str]]:
        """
        An optional comment about the revision.
        """
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "comment", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _RevisionState:
    def __init__(__self__, *,
                 arn: Optional[pulumi.Input[str]] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 data_set_id: Optional[pulumi.Input[str]] = None,
                 revision_id: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        Input properties used for looking up and filtering Revision resources.
        :param pulumi.Input[str] arn: The Amazon Resource Name of this data set.
        :param pulumi.Input[str] comment: An optional comment about the revision.
        :param pulumi.Input[str] data_set_id: The dataset id.
        :param pulumi.Input[str] revision_id: The Id of the revision.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if comment is not None:
            pulumi.set(__self__, "comment", comment)
        if data_set_id is not None:
            pulumi.set(__self__, "data_set_id", data_set_id)
        if revision_id is not None:
            pulumi.set(__self__, "revision_id", revision_id)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if tags_all is not None:
            warnings.warn("""Please use `tags` instead.""", DeprecationWarning)
            pulumi.log.warn("""tags_all is deprecated: Please use `tags` instead.""")
        if tags_all is not None:
            pulumi.set(__self__, "tags_all", tags_all)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        The Amazon Resource Name of this data set.
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[str]]:
        """
        An optional comment about the revision.
        """
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "comment", value)

    @property
    @pulumi.getter(name="dataSetId")
    def data_set_id(self) -> Optional[pulumi.Input[str]]:
        """
        The dataset id.
        """
        return pulumi.get(self, "data_set_id")

    @data_set_id.setter
    def data_set_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "data_set_id", value)

    @property
    @pulumi.getter(name="revisionId")
    def revision_id(self) -> Optional[pulumi.Input[str]]:
        """
        The Id of the revision.
        """
        return pulumi.get(self, "revision_id")

    @revision_id.setter
    def revision_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "revision_id", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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


class Revision(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 data_set_id: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        Provides a resource to manage AWS Data Exchange Revisions.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.dataexchange.Revision("example", data_set_id=example_aws_dataexchange_data_set["id"])
        ```

        ## Import

        Using `pulumi import`, import DataExchange Revisions using their `data-set-id:revision-id`. For example:

        ```sh
        $ pulumi import aws:dataexchange/revision:Revision example 4fa784c7-ccb4-4dbf-ba4f-02198320daa1:4fa784c7-ccb4-4dbf-ba4f-02198320daa1
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] comment: An optional comment about the revision.
        :param pulumi.Input[str] data_set_id: The dataset id.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: RevisionArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a resource to manage AWS Data Exchange Revisions.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        example = aws.dataexchange.Revision("example", data_set_id=example_aws_dataexchange_data_set["id"])
        ```

        ## Import

        Using `pulumi import`, import DataExchange Revisions using their `data-set-id:revision-id`. For example:

        ```sh
        $ pulumi import aws:dataexchange/revision:Revision example 4fa784c7-ccb4-4dbf-ba4f-02198320daa1:4fa784c7-ccb4-4dbf-ba4f-02198320daa1
        ```

        :param str resource_name: The name of the resource.
        :param RevisionArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(RevisionArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 data_set_id: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = RevisionArgs.__new__(RevisionArgs)

            __props__.__dict__["comment"] = comment
            if data_set_id is None and not opts.urn:
                raise TypeError("Missing required property 'data_set_id'")
            __props__.__dict__["data_set_id"] = data_set_id
            __props__.__dict__["tags"] = tags
            __props__.__dict__["arn"] = None
            __props__.__dict__["revision_id"] = None
            __props__.__dict__["tags_all"] = None
        super(Revision, __self__).__init__(
            'aws:dataexchange/revision:Revision',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            arn: Optional[pulumi.Input[str]] = None,
            comment: Optional[pulumi.Input[str]] = None,
            data_set_id: Optional[pulumi.Input[str]] = None,
            revision_id: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None) -> 'Revision':
        """
        Get an existing Revision resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] arn: The Amazon Resource Name of this data set.
        :param pulumi.Input[str] comment: An optional comment about the revision.
        :param pulumi.Input[str] data_set_id: The dataset id.
        :param pulumi.Input[str] revision_id: The Id of the revision.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags: A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] tags_all: A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _RevisionState.__new__(_RevisionState)

        __props__.__dict__["arn"] = arn
        __props__.__dict__["comment"] = comment
        __props__.__dict__["data_set_id"] = data_set_id
        __props__.__dict__["revision_id"] = revision_id
        __props__.__dict__["tags"] = tags
        __props__.__dict__["tags_all"] = tags_all
        return Revision(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        The Amazon Resource Name of this data set.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter
    def comment(self) -> pulumi.Output[Optional[str]]:
        """
        An optional comment about the revision.
        """
        return pulumi.get(self, "comment")

    @property
    @pulumi.getter(name="dataSetId")
    def data_set_id(self) -> pulumi.Output[str]:
        """
        The dataset id.
        """
        return pulumi.get(self, "data_set_id")

    @property
    @pulumi.getter(name="revisionId")
    def revision_id(self) -> pulumi.Output[str]:
        """
        The Id of the revision.
        """
        return pulumi.get(self, "revision_id")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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

